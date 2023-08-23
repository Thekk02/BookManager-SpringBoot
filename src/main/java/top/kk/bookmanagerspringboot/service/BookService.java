package top.kk.bookmanagerspringboot.service;

import top.kk.bookmanagerspringboot.entity.Book;

import java.util.List;

/**
 * @author kk
 * @description 书籍service层
 * @date 2023-08-23 10:36:10
 */
public interface BookService {

    public List<Book> ListBook();

    public Book SelectById(int id);


}
