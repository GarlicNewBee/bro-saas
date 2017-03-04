package cn.demo.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * @Author: BewBee
 * @CreateTime: 2017/3/4 00:32
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "cn.demo.service1")
@EnableFeignClients
@EnableWebMvc
@EnableEurekaClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
