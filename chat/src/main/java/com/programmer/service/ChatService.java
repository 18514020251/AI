package com.programmer.service;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.openai.OpenAiChatModel;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Scanner;

/**
 * AI服务类
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-01 9:46
 */
public class ChatService {
    private static OpenAiChatModel chatModel;
    private static ArrayList<ChatMessage> chatMessages = new ArrayList<>();
    /**
     * 提取前面聊天记录的关键信息，汇总成一条摘要
     * 每有10条记录就生成一条摘要
     * */
    private static ArrayList<ChatMessage> summaryMessages = new ArrayList<>();
    private static final int CHAT_MESSAGE_MAX_COUNT = 3; // 聊天记录最大数量
    private static String messageDir;

    private static String title;

    static {
        // 静态代码块
        Properties properties = new Properties();
        ClassLoader classLoader = ChatService.class.getClassLoader();
        try {
            properties.load(classLoader.getResourceAsStream("ai.properties"));
            String apiKeyName = properties.getProperty("apiKeyName");
            String apiKey = System.getenv(apiKeyName);
            String baseUrl = properties.getProperty("baseUrl");
            String modelName = properties.getProperty("modelName");
            messageDir = properties.getProperty("messageDir");

            chatModel = OpenAiChatModel.builder()
                    .baseUrl(baseUrl)
                    .modelName(modelName)
                    .apiKey(apiKey)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String chat(String question) throws IOException {
        // 第一个问题的前10个字作为文件标题
        if (title == null) {
            String str = question;
            str.replaceAll("[^\\u4e00-\\u9fffa-zA-Z0-9]","");
            if (question.length()>10) {
                str = str.substring(0,10);
            }
            title=str + ".txt";
        }
        if (chatMessages.size() >= CHAT_MESSAGE_MAX_COUNT){
            generateSummary();
            saveChatRecords();

            chatMessages.clear();
        }
        UserMessage userMessage = UserMessage.from(question);
        chatMessages.add(userMessage);

        ArrayList<ChatMessage> list = new ArrayList<>();
        list.addAll(summaryMessages);
        list.addAll(chatMessages);


        ChatResponse chatResponse = chatModel.chat(list); // 发送整个集合
        AiMessage aiMessage = chatResponse.aiMessage();
        chatMessages.add(aiMessage);
        return aiMessage.text();
    }

    /**
     * 生成摘要
     * */
    private static void generateSummary() {
        new Thread(() -> {
            SystemMessage systemMessage = SystemMessage.from("你是你个小助手，帮我整理这些聊天记录的摘要、尽量用精简的话或几个关键字总结摘要");
            ArrayList<ChatMessage> list = new ArrayList<>();
            list.add(systemMessage);
            list.addAll(chatMessages);
            list.addAll(summaryMessages);

            ChatResponse chatResponse = chatModel.chat(list);
            AiMessage aiMessage = chatResponse.aiMessage();
            summaryMessages.clear();// 可选
            summaryMessages.add(aiMessage);
            System.out.println("摘要内容如下" + aiMessage.text());
        }).start();
    }

    /**
     * 存储聊天记录
     * */
    public static void saveChatRecords(){
        new Thread(() -> {
            mkdir();
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(messageDir + "\\" + title,true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            PrintStream ps = new PrintStream(fos);
            for (ChatMessage chatMessage : chatMessages) {
                if (chatMessage instanceof UserMessage u){
                    ps.println("我:" + u.singleText());
                }else if (chatMessage instanceof AiMessage a){
                    ps.println("AI:" + a.text());
                }
            }
        }).start();

    }

    private static void mkdir() {
        File dir = new File(messageDir);
        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            if (created) {
                System.out.println("创建目录: " + messageDir);
            } else {
                System.err.println("无法创建目录: " + messageDir);
            }
        }
    }

    public static ArrayList<File> listAllHistories(){
        mkdir();
        File dir = new File(messageDir);
        File[] files = dir.listFiles();
        ArrayList<File> list = new ArrayList<>();
        Collections.addAll(list , files);
        return list;
    }

    /**
     * 读取历史聊天记录文件内容
     * */
    public static  void  generateHistorySummary(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
            SystemMessage systemMessage = SystemMessage.from("你是你个小助手，帮我总结这些聊天记录的摘要、尽量用精简的话或几个关键字总结摘要");

            UserMessage userMessage = UserMessage.from(sb.toString());
            ArrayList<ChatMessage> list = new ArrayList<>();
            list.add(systemMessage);
            list.add(userMessage);

            ChatResponse chatResponse = chatModel.chat(list);
            AiMessage aiMessage = chatResponse.aiMessage();
            summaryMessages.clear();// 可选
            summaryMessages.add(aiMessage);
            System.out.println("摘要内容如下" + aiMessage.text());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
