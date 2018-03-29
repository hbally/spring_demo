package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

//设置多配置文件很简单,@Profile("development")即调用application-development.properties|yml文件,
// 也可以调用SpringApplication中的etAdditionalProfiles()方法
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private CityMapper cityMapper;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
//        app.addListeners(new AppStartEventListener(), new AppEnvPreEventListener(), new AppPreparedEvent(), new AppFailedEvent());
        app.run(args);
        System.out.println("#app start #");
    }

    @Autowired
    private User user;

    @Override
    public void run(String... args) throws Exception {
        //测试mybatis
//		System.out.println("#app run mybatis before#");
//		System.out.println("city by id " + cityMapper.findByState("CA"));
//		System.out.println("#app run mybatis later#");
        System.out.println("加载配置信息装载到bean :" + user.toString());
    }
}
