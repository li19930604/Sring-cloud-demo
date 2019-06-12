package com.iacs.info.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author peicj
 * @Description: feign重试配置
 * @date 2019-06-12
 */
@Configuration
public class FeignConfig {

    public static int connectTimeOutMillis = 180000;//连接超时时间
    public static int readTimeOutMillis = 180000;//赌球超时时间

    /**
     *  超时时间设置
     * @return
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeOutMillis, readTimeOutMillis);
    }

    /**
     *  重试配置
     * @return
     */
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100,1000,4);//重试周期，最大重试周期，重试次数
    }
}
