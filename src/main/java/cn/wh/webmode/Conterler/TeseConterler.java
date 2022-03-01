package cn.wh.webmode.Conterler;

import cn.wh.mode.affair.UserAffair;
import cn.wh.mode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class TeseConterler {
    @Autowired
    UserService userService;

    @Autowired
    UserAffair userAffair;

    @RequestMapping(value = "/hi")
    public ModelAndView hi(ModelAndView md) {
        System.out.println("/user/hi");
        md.setViewName("AxiosVue");
        md.addObject("list", userService.selectUser());
        return md;
    }

    @RequestMapping(value = "/he")
    @ResponseBody
    public List he() {
        System.out.println("/user/he");
        return userService.selectUser();
    }

    @RequestMapping(value = "/singin")//登陆页面
    public ModelAndView singin(ModelAndView md) {
        System.out.println("/user/singin");
        md.setViewName("singin");
        return md;
    }

    @RequestMapping(value = "/singinuser")//登陆方法
    @ResponseBody
    public boolean singinuser(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            HttpServletRequest req) {
        System.out.println("/user/singinuser");
        System.out.println("账号:" + username + "  密码:" + password);
        return userAffair.singin(username, password, req);
    }

    @RequestMapping(value = "/login")//注册页面
    public ModelAndView login(ModelAndView md) {
        System.out.println("/user/login");
        md.setViewName("login");
        return md;
    }

    @RequestMapping(value = "/loginuser")//注册方法
    @ResponseBody
    public boolean loginuser(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "account") String account,
            @RequestParam(value = "password1") String password1,
            @RequestParam(value = "password2") String password2,
            HttpServletRequest req) {
        System.out.println("/user/loginuser");
        Boolean b = false;
        if (password1.equals(password2)) {
            b = userAffair.login(name, account, password1);
            return b;
        } else return b;
    }

}
