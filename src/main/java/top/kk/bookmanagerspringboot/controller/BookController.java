package top.kk.bookmanagerspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.kk.bookmanagerspringboot.entity.Book;
import top.kk.bookmanagerspringboot.service.Impl.BookServiceImpl;

import java.util.List;

/**
 * @author kk
 * @description 图书控制层
 * @date 2023-08-23 15:14:51
 */
@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    /**
    * @Params:
    * @Return: 所有图书的列表
    */
    @GetMapping("/listBook")
    @ResponseBody
    public List<Book> listBook(){return bookService.ListBook();}

    /**
    * @Params: bookid：图书id
    * @Return: 图书
    */
    @GetMapping("/bookid={bookid}")
    @ResponseBody
    public Book selectById(@PathVariable("bookid")int bookid){return bookService.SelectById(bookid);}


}
