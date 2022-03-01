package cn.wh.modeSE.cglibAgent;

public class UserService {
    public void userLogin() {
        System.out.println("执行UserService.userLogin()方法");
    }
    public void userSingin() {
        System.out.println("执行UserService.userSingin()方法");
    }

    public String systemLogin() {
        System.out.println("执行UserService.systemLogin()方法");
        return "run--> systemLogin()";
    }

    public String systemSingin() {
        System.out.println("我是UserService.systemSingin()方法");
        return "run--> systemSingin()";
    }

}
