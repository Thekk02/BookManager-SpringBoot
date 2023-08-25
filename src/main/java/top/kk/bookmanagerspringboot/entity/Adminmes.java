package top.kk.bookmanagerspringboot.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author kk
 * @description 管理员消息实体类
 * @date 2023-08-23 10:28:48
 */
public class Adminmes {
    private int Id;
    private String Content;
    private Timestamp Time;

    public Adminmes(int id, String content, Timestamp time) {
        Id = id;
        Content = content;
        Time = time;
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

    public Timestamp getTime() {
        return Time;
    }

    public void setTime(Timestamp time) {
        Time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adminmes)) return false;
        Adminmes adminmes = (Adminmes) o;
        return getId() == adminmes.getId() && getContent().equals(adminmes.getContent()) && getTime().equals(adminmes.getTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent(), getTime());
    }

    @Override
    public String toString() {
        return "Adminmes{" +
                "Id=" + Id +
                ", Content='" + Content + '\'' +
                ", Time=" + Time +
                '}';
    }
}
