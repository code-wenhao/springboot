package cn.wh.mode.service;

import cn.wh.mode.dao.UserMapper;
import cn.wh.mode.dao.Utils.MybatisUtils;
import cn.wh.mode.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//交易服务类
public class TradeService {

    public Boolean payment(String account1, String account2, int value) {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int balance1 = mapper.obtainUser(account1);
        int balance2 = mapper.obtainUser(account2);
        if (value <= balance1) {
            mapper.payment(account1, balance1 - value);
            mapper.payment(account2, balance2 + value);
            //mybatis事物默认不自动提交
            session.commit();
            return true;
        } else session.close();
        return false;
    }

}
