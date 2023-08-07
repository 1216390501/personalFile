package top.tool.chatgpt;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.sun.deploy.util.StringUtils;
import top.tool.chatgpt.dto.Message;
import top.tool.chatgpt.dto.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Author ：zsj
 * @Date ：26/4/2023 2:19 pm
 * @Description：
 */
public class Main {
    private static final String URL="https://api.openai.com/v1/chat/completions";
    private static final String API_KEY="";
    public static void main(String[] args) {
        List<Message> list = new ArrayList<>();
        while (true) {
            System.out.println("请输入要查询的内容:");
            //获取输入的内容
            Scanner dc = new Scanner(System.in);
            String input = dc.next();
            if("exit".equals(input)){
                System.out.println("已退出程序");
                break;
            }

            Message message = new Message();
            message.setRole("user");
            message.setContent(input);
            list.add(message);

            RequestBody requestBody = new RequestBody();
            requestBody.setModel("gpt-3.5-turbo");
            requestBody.setMessages(list);

            String data = JSON.toJSONString(requestBody);
            String body = HttpRequest.post(URL)
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer")
                    .body(data)
                    .execute()
                    .body();
            JSONObject jsonObject = JSON.parseObject(body);
            System.out.println("输出返回报文：" + jsonObject);
        }
    }


}