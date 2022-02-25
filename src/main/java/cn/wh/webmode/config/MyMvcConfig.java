package cn.wh.webmode.config;

import cn.wh.webmode.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Autowired
    UserInterceptor userInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor)//注册自定义拦截器
                .addPathPatterns("/user/he")//设置拦截路径
                .excludePathPatterns("/user/singinuser")//设置不拦截路劲
                .excludePathPatterns("/user/singin").excludePathPatterns("/user/login");
    }


}
