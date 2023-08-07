package top.tool.chatgpt.dto;

/**
 * @ClassName Message
 * @Author ：zsj
 * @Date ：26/4/2023 2:25 pm
 * @Description：
 */
public class Message {
    private String role;
    private String content;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "role='" + role + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}