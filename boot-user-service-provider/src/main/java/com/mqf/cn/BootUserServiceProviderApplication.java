package com.mqf.cn;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 *  1、导入依赖
 *      1）、导入 dubbo-starter
 *      2）、导入 dubbo 其他依赖
 *  2、SpringBoot 与dubbo 整合的三种方式
 *      1）导入 dubbo-starter，在 application.properties 配置属性，
 *          使用 @Service【暴露服务】（provider方）和  @Reference【引用】（customer方）
 *          @EnableDubbo 开启基于注解的dubbo功能
 *      2）保留 dubbo xml 配置文件, 不使用  @Service
 *      3）
 */
//@EnableDubbo //开启基于注解的dubbo功能
@ImportResource(locations="classpath:provider.xml")
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

