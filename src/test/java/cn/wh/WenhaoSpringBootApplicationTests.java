package cn.wh;

import cn.wh.mode.pojo.User;
import cn.wh.mode.service.TradeService;
import cn.wh.mode.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class WenhaoSpringBootApplicationTests {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    UserService userService;
    @Autowired
    TradeService tradeService;

    private static final Logger LOGGER = LoggerFactory.getLogger(WenhaoSpringBootApplicationTests.class);

    @Test
    void contextLoads() {

        LOGGER.warn("WARN");
        LOGGER.error("error");
        LOGGER.info("info");//默认日志等级
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        try {
            int sum = 5/0;
            System.out.println(sum);
        } catch (Exception e) {
            LOGGER.debug("报错",e);
        }

//        String[] str = applicationContext.getBeanDefinitionNames();
//        for (String string : str) {
//            System.out.println("..." + string);
//        }

//        int balance = userService.ObUser("admin123");
//        System.out.println(balance);

        //System.out.println(tradeService.payment("admin123","xmzr123",300));
    }



}
