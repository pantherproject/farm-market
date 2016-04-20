package com.freetek.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * start listener
 * Created by panther.dongdong on 2016/4/20.
 */
public class StartListener implements ServletContextListener {
    private Logger LOGGER = LoggerFactory.getLogger(StartListener.class);

    public StartListener() {

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //todo start listener
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ;
    }
}

