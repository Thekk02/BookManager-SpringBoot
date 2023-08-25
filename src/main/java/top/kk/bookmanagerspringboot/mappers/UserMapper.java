package top.kk.bookmanagerspringboot.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.kk.bookmanagerspringboot.entity.User;

import java.util.List;

/**
 * @author kk
 * @description 用户DAO层
 * @date 2023-08-23 10:34:24
 */
@Mapper
public interface UserMapper {
    /**
    * @Description:查询所有用户
    * @Params:
    * @Return: 用户列表
    */
    @Select("select * from user")
    public List<User> SelectAll();
    
    /**
    * @Description: 
    * @Params:
    * @Return: 
    */
    @Select("select from user where username = #{name} and password = #{pwd}")
    public User SelectUserByNameAndPwd(String name,String pwd);

}
