package cn.it8090.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 18:36 2018/1/22
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        int i = 1 / 0;
        return "hello";
    }
}
