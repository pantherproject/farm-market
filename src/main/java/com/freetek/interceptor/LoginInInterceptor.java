package com.freetek.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by panther.dongdong on 2016/4/20.
 */
public class LoginInInterceptor implements HandlerInterceptor {
    public static final Logger logger = LoggerFactory.getLogger(LoginInInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String ip;

        if (httpServletRequest.getHeader("x-forwarded-for") == null) {
            ip = httpServletRequest.getRemoteAddr();
        } else {
            ip = httpServletRequest.getHeader("x-forwarded-for");
        }
        logger.info("ip is {}", ip);


        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
