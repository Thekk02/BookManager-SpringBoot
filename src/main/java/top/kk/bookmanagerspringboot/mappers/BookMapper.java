package top.kk.bookmanagerspringboot.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.kk.bookmanagerspringboot.entity.Book;

import java.util.List;

/**
 * @author kk
 * @description 书籍dao层
 * @date 2023-08-23 10:33:01
 */
@Mapper
public interface BookMapper {
    /**
    * @Params:
    * @Return: 图书列表
    */
    @Select("select * from book")
    public List<Book> SelectAllBook();

    /**
    * @Params: id(BookId)
    * @Return: 查询的图书
    */
    @Select("select * from book where Bookid = #{id}")
    public Book SelectById(int id);

    @Select("")
    public Book SelectBook();

}
