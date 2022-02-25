package cn.wh.mode.service;

import cn.wh.mode.dao.UserMapper;
import cn.wh.mode.dao.Utils.MybatisUtils;
import cn.wh.mode.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserService {
    //	登录
    public User singin(String account, String password) {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.loginUser(account, password);
        session.close();
        return user;
    }

    //注册
    public int login(User user) {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        if (null == mapper.UserQuery(user.getAccount())) {
            int i = mapper.addUser(user);
            session.commit();
            session.close();
            return i;
        }
        session.close();
        return 0;
    }

    //查询指定账户余额
    public int obtainUser(String account) {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int balance = mapper.obtainUser(account);
        session.close();
        return balance;
    }

    //查询所有用户
    public List<User> selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
//		List<User> users = session.selectList("cn.mode.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        session.close();
        return users;
    }

}
