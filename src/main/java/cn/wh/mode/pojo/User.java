package cn.wh.mode.pojo;

import cn.wh.mode.pojo.UserAttribute.Balance;

public class User {
    String name;
    String account;
    String password;
    int balance;

    public User() {
    }

    public User(String name, String account, String password, int balance) {
        this.name = name;
        this.account = account;
        this.password = password;

    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "用户[" +
                "昵称:'" + name + '\'' +
                ", 账户:'" + account + '\'' +
                ", 密码:'" + password + '\'' +
                ", 余额:'" + balance + '\'' +
                ']';
    }
}
