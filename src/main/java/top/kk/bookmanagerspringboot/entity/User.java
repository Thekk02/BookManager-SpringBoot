package top.kk.bookmanagerspringboot.entity;

import java.util.Objects;

/**
 * @author kk
 * @description 用户实体类
 * @date 2023-08-23 09:07:17
 */
public class User {
    private String Username;
    private String Password;
    private String Gender;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public User(String username, String password, String gender) {
        Username = username;
        Password = password;
        Gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getGender(), user.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getGender());
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
