package cn.wh;

<<<<<<< HEAD
import cn.wh.mode.service.TradeService;
import cn.wh.mode.service.UserService;
import cn.wh.modeSE.cglibAgent.CostTimeProxy;
import cn.wh.modeSE.cglibAgent.ServiceTest;
import cn.wh.modeSE.cglibAgent.UserServiceAgent;
import cn.wh.modeSE.springEvent.UserRegisterService;
=======
import cn.wh.mode.pojo.User;
import cn.wh.mode.service.TradeService;
import cn.wh.mode.service.UserService;
>>>>>>> e8b38d5e08ebe8a2044cfc3d5a0f75ed49982d08
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
<<<<<<< HEAD
=======
import org.springframework.context.support.ClassPathXmlApplicationContext;
>>>>>>> e8b38d5e08ebe8a2044cfc3d5a0f75ed49982d08

@SpringBootTest
class WenhaoSpringBootApplicationTests {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    UserService userService;
    @Autowired
    TradeService tradeService;

    private static final Logger LOGGER = LoggerFactory.getLogger(WenhaoSpringBootApplicationTests.class);

<<<<<<< HEAD
    /*@Test
=======
    @Test
>>>>>>> e8b38d5e08ebe8a2044cfc3d5a0f75ed49982d08
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
<<<<<<< HEAD

    }*/

    @Test
    void test1() {
        UserRegisterService userRegisterService = applicationContext.getBean(UserRegisterService.class);
        //模拟用户注册
        userRegisterService.registerUser("路人甲Java");
    }

    @Test
    void test2() {
        UserServiceAgent userServiceAgent = new UserServiceAgent();
        userServiceAgent.agent1();

        ServiceTest serviceTest = CostTimeProxy.createProxy(new ServiceTest());
        serviceTest.test1();
    }
=======
    }


>>>>>>> e8b38d5e08ebe8a2044cfc3d5a0f75ed49982d08

}
