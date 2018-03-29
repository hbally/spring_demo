package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by pesu on 2018/3/29.
 * 配置文件中的数据读取出来
 */
@Component
public class User {
    private @Value("${userName:lkl}")
    String name;
    private @Value("${age}")
    Integer age;
    private @Value("${remark}")
    String remark;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", remark='" + remark + '\'' +
                '}';
    }
}
