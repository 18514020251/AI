import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 *  测试云端调用
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-04-01 9:29
 */
public class TestCloud {
    public static void main(String[] args) {
        // 系统变量KEY获取token值
        String aiKey = System.getenv("AI_KEY");
        String apiKey = aiKey.substring(0,7);
        System.out.println("apiKey = " + apiKey);
        OpenAiChatModel chatModel = OpenAiChatModel.builder()
                .baseUrl("https://dashscope.aliyuncs.com/compatible-mode/v1")
                .modelName("qwen-plus")
                .apiKey(aiKey)
                .build();

        UserMessage userMessage = UserMessage.from("你好，你是谁");
        ChatResponse chatResponse = chatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
        String text = aiMessage.text();
        System.out.println("text = " + text);
    }
}
