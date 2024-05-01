package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import tk.mybatis.spring.annotation.MapperScan;

import javax.swing.*;
@MapperScan("com.atguigu.cloud.mapper")
public class Main8001 {
    public static void main(String[] args) {

        SpringApplication.run(Main8001.class);
    }
}