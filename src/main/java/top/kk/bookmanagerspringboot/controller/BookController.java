package top.kk.bookmanagerspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.kk.bookmanagerspringboot.entity.Book;
import top.kk.bookmanagerspringboot.service.Impl.BookServiceImpl;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author kk
 * @description 图书控制层
 * @date 2023-08-23 15:14:51
 */
@Slf4j
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
    public Book selectById(@PathVariable("bookid")int bookid){
        log.info(bookService.SelectById(bookid).toString());
        log.info("这是一个日志的测试项");
        return bookService.SelectById(bookid);}


}
