package com.warape.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 万明宇
 * @date 2019/6/26 22:07
 */
@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboProviderApplication.class,args);
    }
}
