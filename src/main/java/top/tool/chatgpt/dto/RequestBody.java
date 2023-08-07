package top.tool.chatgpt.dto;

import java.util.List;

/**
 * @ClassName RequestBody
 * @Author ：zsj
 * @Date ：26/4/2023 2:24 pm
 * @Description：
 */
public class RequestBody {
    private String model;
    private List<Message> messages;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "RequestBody{" +
                "model='" + model + '\'' +
                ", messages=" + messages +
                '}';
    }
}