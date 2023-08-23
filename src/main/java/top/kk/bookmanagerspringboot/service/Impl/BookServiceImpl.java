package top.kk.bookmanagerspringboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.kk.bookmanagerspringboot.entity.Book;
import top.kk.bookmanagerspringboot.mappers.BookMapper;
import top.kk.bookmanagerspringboot.service.BookService;

import java.util.List;

/**
 * @author kk
 * @description 图书service层的实现类
 * @date 2023-08-23 14:41:51
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> ListBook() {
        return bookMapper.SelectAllBook();
    }

    @Override
    public Book SelectById(int id) {
        return bookMapper.SelectById(id);
    }
}
