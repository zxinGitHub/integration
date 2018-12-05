package com.demo.integration.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DateSourceConfig {

    /*@Resource
    private DataSource dataSource;

    *//**
     * 但是如果使用的是"mybatis-spring-1.0.0-RC3.jar"这个版本是没有问题的。但是高版本就会有问题，原因是Mybatis3依赖的jar包"mybatis-spring-1.2.0.jar"这个版本以及以上的版本中，对SqlSessionDaoSupport类中的'sqlSessionFactory'或'sqlSessionTemplate'注入方式进行了调整。
     * 可以更好的支持多数据源的问题
     *
     * 用以下这些依赖包需要配置sqlSessionFactory
     *      <dependency>
     *             <groupId>com.baomidou</groupId>
     *             <artifactId>mybatisplus-spring-boot-starter</artifactId>
     *             <version>1.0.5</version>
     *         </dependency>
     *
     *         &lt;!&ndash; MP 核心库 &ndash;&gt;
     *         <dependency>
     *             <groupId>com.baomidou</groupId>
     *             <artifactId>mybatis-plus</artifactId>
     *             <version>3.0.5</version>
     *         </dependency>
     *
     *         &lt;!&ndash; 模板引擎 代码生成 &ndash;&gt;
     *         <dependency>
     *             <groupId>org.apache.velocity</groupId>
     *             <artifactId>velocity</artifactId>
     *             <version>1.7</version>
     *         </dependency>
     *
     * 用以下依赖包不需要配置sqlSessionFactory
     *          <dependency>
     *             <groupId>com.baomidou</groupId>
     *             <artifactId>mybatis-plus-boot-starter</artifactId>
     *             <version>3.0.1</version>
     *         </dependency>
     *
     * @return
     * @throws Exception
     *//*
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }*/

}
