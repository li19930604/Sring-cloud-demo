package com.iacs.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RefreshScope   //动态刷新配置
@EnableEurekaClient //注册中心客户端
@EnableHystrix  //熔断器
@EnableFeignClients //服务调用
@EnableHystrixDashboard//展示熔断器仪表盘
@SpringBootApplication  //自动装配注解
public class InfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoApplication.class, args);
    }


}
