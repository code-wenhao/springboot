package cn.wh.modeSE.cglibAgent;

import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

public class UserServiceAgent {
    public void agent1() {
        Enhancer enhancer = new Enhancer();
        //创建2个Callback
        Callback costTimeCallback = (MethodInterceptor) (Object o, Method method, Object[] objects, MethodProxy methodProxy) -> {
            long starTime = System.nanoTime();
            Object result = methodProxy.invokeSuper(o, objects);
            long endTime = System.nanoTime();
            System.out.println(method + "，耗时(纳秒):" + (endTime - starTime));
            return result;
        };

        //下面这个用来拦截所有system开头的方法，返回固定值的
        Callback fixdValueCallback = (FixedValue) () -> "System开头的方法被执行";

        CallbackHelper callbackHelper = new CallbackHelper(UserService.class, null) {
            @Override
            protected Object getCallback(Method method) {
                return method.getName().startsWith("system") ? fixdValueCallback : costTimeCallback;
            }
        };
        enhancer.setSuperclass(UserService.class);
        //调用enhancer的setCallbacks传递Callback数组
        enhancer.setCallbacks(callbackHelper.getCallbacks());
        /**
         * 设置CallbackFilter,用来判断某个方法具体走哪个Callback
         */
        enhancer.setCallbackFilter(callbackHelper);
        UserService proxy = (UserService) enhancer.create();
        proxy.userLogin();
        proxy.userSingin();
        System.out.println(proxy.systemLogin());
        System.out.println(proxy.systemSingin());
    }

}
