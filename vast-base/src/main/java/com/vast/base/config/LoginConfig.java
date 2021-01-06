package com.vast.base.config;

import com.vast.base.interceptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.config
 * @ClassName: LoginConfig
 * @Author: Administrator
 * @Description: 拦截器配置
 * @Date: 2021/1/5 15:19
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new AdminInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                "/",            //登录
                "/**/*.html",            //html静态资源
                "/**/*.js",              //js静态资源
                "/**/*.css",             //css静态资源
                "/vast/verifyCode*",    //验证码
                "/**/*.jpeg",
                "/**/*.jpg",
                "/**/*.woff",
                "/**/*.ttf"
        );
    }
}
