package com.wxz.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @param args
 * 1.整合mybatis-plus pom.xml
 *     a.<dependency>
 *         <groupId>com.baomidou</groupId>
 *         <artifactId>mybatis-plus-boot-starter</artifactId>
 *         <version>3.5.1</version>
 *    b.配置
 *       配置数据源
 *          导入数据库驱动
 *          配置数据源 application.yml
 *       配置mybatis-plus
 *          使用MapperScan注解引入dao
 *          告诉mybatisplus sql映射文件位置
 *
 */
@MapperScan("com.wxz.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
