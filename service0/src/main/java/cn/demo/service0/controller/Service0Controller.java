package cn.demo.service0.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @Author: BewBee
 * @CreateTime: 2017/3/4 00:32
 * @Description:
 */
@RestController
public class Service0Controller {

    @GetMapping("test")
    String test() {
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }

}
