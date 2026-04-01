package com.programmer.view;

import com.programmer.service.ChatService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  AI视图
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-01 9:41
 */
public class ChatView {
    private static Scanner scanner = new Scanner(System.in);
    private static final String EXIT_TEXT = "bye";

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("==========    欢迎使用聊天工具    ==========");
            System.out.println("\t\t\t1、查看历史聊天记录");
            System.out.println("\t\t\t2、开启新对话");
            System.out.println("\t\t\t3、退出");
            System.out.print("请选择：");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select){
                case 1 -> history();
                case 2 -> chat();
                case 3 -> {
                    ChatService.saveChatRecords();
                    scanner.close();
                    flag = false;
                }
            }
        }

    }
    public static void history() throws FileNotFoundException {
        // 读取所有聊天记录文件列表
        ArrayList<File> files = ChatService.listAllHistories();
        if (files.isEmpty()){
            System.out.println("没有聊天记录");
            return;
        }
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            System.out.println((i+1) + "、" + file.getName());
        }
        // 选择你要哪个聊天记录
        System.out.print("请选择：");
        int id = scanner.nextInt();
        scanner.nextLine();

        // 显示某个聊天记录文件内容
        File file = files.get(id-1);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
        fileScanner.close();

        System.out.println("==========        ==========");
        System.out.println("是否基于当前聊天继续聊天(Y/N)");
        String choice = scanner.nextLine();
        if ("N".equalsIgnoreCase(choice)){
            return;
        }else {
            // 把之前的聊天记录生成摘要
            // 继续对话
        }
    }

    public static void chat() throws IOException {
        while (true){
            System.out.println("==========  ==========");
            System.out.print("请输入你要问的问题：");
            String question = scanner.nextLine();
            if (EXIT_TEXT.equalsIgnoreCase(question)){
                System.out.println("谢谢使用");
                break;
            }

            if (question.isBlank()){
                System.out.println("问题不能为空");
                continue;
            }

            String answer = ChatService.chat(question);
            System.out.println("AI回答:" + answer);
        }
    }

}
