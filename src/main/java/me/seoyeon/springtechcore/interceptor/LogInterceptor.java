package me.seoyeon.springtechcore.interceptor;

import me.seoyeon.springtechcore.event.Log;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInterceptor implements HandlerInterceptor {

    private final ApplicationEventPublisher eventPublisher;

    public LogInterceptor(ApplicationEventPublisher eventPublisher){
        this.eventPublisher = eventPublisher;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String[] key = request.getParameterValues("key");
        String mainKey = key[0];
        eventPublisher.publishEvent(new Log(mainKey));
        return true;
    }
}
