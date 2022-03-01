package cn.wh.mode.dao;

import cn.wh.mode.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> selectUser();//获取所有用户数据

    @Select("select * from user where account = #{account} and password = #{password}")
    User loginUser(String account, String password);//获取满足账号密码的用户数据

    @Select("select account from user where account = #{account}")
    User UserQuery(String account);//查询账号是否存在

    @Select("select balance from user where account = #{account}")
    int obtainUser(String account);//获取指定账号的余额

    @Update("update user set balance = #{balance} where account = #{account}")
    Boolean payment(String account, int balance);//修改指定账号的余额

    @Insert("insert into user(name,account,password,balance)values(#{name},#{account},#{password},#{balance})")
    int addUser(User user);//插入用户

}
