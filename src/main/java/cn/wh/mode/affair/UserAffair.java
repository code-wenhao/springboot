package cn.wh.mode.affair;

import cn.wh.mode.pojo.User;
import cn.wh.mode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class UserAffair {
    @Autowired
    UserService userService;
    @Autowired
    ApplicationContext applicationContext;

    //登录方法
    public Boolean singin(String account, String password, HttpServletRequest req) {
        User user = userService.singin(account, password);
        if (null != user) {
            req.getSession().setAttribute("user", user);
            return true;
        } else return false;
    }

    //	注册方法
    public Boolean login(String name, String account, String password) {
        int i = userService.login(new User(name, account, password, 0));
        if (i == 1) return true;
        return false;
    }

    //查询所有用户方法
    public void selectUser() {
        List<User> users = userService.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
