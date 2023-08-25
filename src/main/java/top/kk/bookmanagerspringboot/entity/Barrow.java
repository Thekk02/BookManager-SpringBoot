package top.kk.bookmanagerspringboot.entity;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author kk
 * @description 借阅表实体类
 * @date 2023-08-23 09:31:44
 */
public class Barrow {
    private int Id;
    private String Bookid;
    private String Title;
    private String Author;
    private String Price;
    private String Type;
    private String Floor;
    private String Name;
    private Timestamp Barrowingtime;
    private Timestamp Returntime;
    private String Status;

    public Barrow(int id, String bookid, String title, String author, String price, String type, String floor, String name, Timestamp barrowingtime, Timestamp returntime, String status) {
        Id = id;
        Bookid = bookid;
        Title = title;
        Author = author;
        Price = price;
        Type = type;
        Floor = floor;
        Name = name;
        Barrowingtime = barrowingtime;
        Returntime = returntime;
        Status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBookid() {
        return Bookid;
    }

    public void setBookid(String bookid) {
        Bookid = bookid;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Timestamp getBarrowingtime() {
        return Barrowingtime;
    }

    public void setBarrowingtime(Timestamp barrowingtime) {
        Barrowingtime = barrowingtime;
    }

    public Timestamp getReturntime() {
        return Returntime;
    }

    public void setReturntime(Timestamp returntime) {
        Returntime = returntime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Barrow)) return false;
        Barrow barrow = (Barrow) o;
        return getId() == barrow.getId() && getBookid().equals(barrow.getBookid()) && getTitle().equals(barrow.getTitle()) && getAuthor().equals(barrow.getAuthor()) && getPrice().equals(barrow.getPrice()) && getType().equals(barrow.getType()) && getFloor().equals(barrow.getFloor()) && getName().equals(barrow.getName()) && getBarrowingtime().equals(barrow.getBarrowingtime()) && getReturntime().equals(barrow.getReturntime()) && getStatus().equals(barrow.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBookid(), getTitle(), getAuthor(), getPrice(), getType(), getFloor(), getName(), getBarrowingtime(), getReturntime(), getStatus());
    }

    @Override
    public String toString() {
        return "Barrow{" +
                "Id=" + Id +
                ", Bookid='" + Bookid + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Price='" + Price + '\'' +
                ", Type='" + Type + '\'' +
                ", Floor='" + Floor + '\'' +
                ", Name='" + Name + '\'' +
                ", Barrowingtime=" + Barrowingtime +
                ", Returntime=" + Returntime +
                ", Status='" + Status + '\'' +
                '}';
    }
}
