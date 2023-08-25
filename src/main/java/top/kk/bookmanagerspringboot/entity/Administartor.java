package top.kk.bookmanagerspringboot.entity;

import java.util.Objects;

/**
 * @author kk
 * @description 管理员实体类
 * @date 2023-08-23 09:31:16
 */
public class Administartor {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administartor)) return false;
        Administartor that = (Administartor) o;
        return Objects.equals(getUsername(), that.getUsername()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getGender(), that.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getGender());
    }

    @Override
    public String toString() {
        return "Administartor{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public Administartor(String username, String password, String gender) {
        Username = username;
        Password = password;
        Gender = gender;
    }
}
