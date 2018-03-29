package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * Created by pesu on 2018/3/29.
 * spring boot启动开始时执行的事件
 * 启动监听类
 */
public class AppStartEventListener implements ApplicationListener<ApplicationStartedEvent>{

    private Logger logger = LoggerFactory.getLogger(AppStartEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SpringApplication app = event.getSpringApplication();
        app.setBannerMode(Banner.Mode.OFF);// 关闭启动Banner
        logger.warn("==AppStartEventListener==");
    }
}
