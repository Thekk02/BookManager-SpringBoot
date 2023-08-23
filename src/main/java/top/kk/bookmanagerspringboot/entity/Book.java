package top.kk.bookmanagerspringboot.entity;

import java.util.Objects;

/**
 * @author kk
 * @description 书的实体类
 * @date 2023-08-23 08:54:55
 */
public class Book {
    private int BookId;
    private String Title;
    private String Author;
    private String Price;
    private String Type;
    private String Floor;
    private String Status;


    public Book(int bookId, String title, String author, String price, String type, String floor, String status) {
        BookId = bookId;
        Title = title;
        Author = author;
        Price = price;
        Type = type;
        Floor = floor;
        Status = status;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getBookId() == book.getBookId() && getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor()) && getPrice().equals(book.getPrice()) && getType().equals(book.getType()) && getFloor().equals(book.getFloor()) && getStatus().equals(book.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getTitle(), getAuthor(), getPrice(), getType(), getFloor(), getStatus());
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Price='" + Price + '\'' +
                ", Type='" + Type + '\'' +
                ", Floor='" + Floor + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
