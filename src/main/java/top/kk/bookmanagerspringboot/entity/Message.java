package top.kk.bookmanagerspringboot.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author kk
 * @description 消息实体类
 * @date 2023-08-23 10:28:17
 */
public class Message {
    private int Id;
    private String Content;
    private Timestamp Datatime;
    private String Username;

    public Message(int id, String content, Timestamp datatime, String username) {
        Id = id;
        Content = content;
        Datatime = datatime;
        Username = username;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Timestamp getDatatime() {
        return Datatime;
    }

    public void setDatatime(Timestamp datatime) {
        Datatime = datatime;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return getId() == message.getId() && Objects.equals(getContent(), message.getContent()) && Objects.equals(getDatatime(), message.getDatatime()) && Objects.equals(getUsername(), message.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent(), getDatatime(), getUsername());
    }

    @Override
    public String toString() {
        return "Message{" +
                "Id=" + Id +
                ", Content='" + Content + '\'' +
                ", Datatime=" + Datatime +
                ", Username='" + Username + '\'' +
                '}';
    }
}
