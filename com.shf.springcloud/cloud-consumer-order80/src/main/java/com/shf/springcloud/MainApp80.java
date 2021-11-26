package com.shf.springcloud;

import com.shf.myrule.MySeleRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MySeleRule.class)
public class MainApp80
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp80.class,args);
    }
}
