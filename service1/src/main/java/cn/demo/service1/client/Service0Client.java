package cn.demo.service1.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: NewBee
 * @CreateTime: 2017/3/4 00:28
 * @Description:
 */
@FeignClient("service0")
public interface Service0Client {

    @RequestMapping(method = RequestMethod.GET, path = "test")
    String test();

}
