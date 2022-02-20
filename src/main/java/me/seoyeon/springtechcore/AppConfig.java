package me.seoyeon.springtechcore;

import me.seoyeon.springtechcore.interceptor.LogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // LogInterceptor logInterceptor = new LogInterceptor(applicationEventPublisher);
       // InterceptorRegistration registration = registry.addInterceptor(logInterceptor);
       // registration.addPathPatterns("/data/**");
    }
}
