package cn.it8090.springbootdemo.controller;

import cn.it8090.springbootdemo.service.SpringBootJdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 19:19 2018/1/22
 */
@Controller
public class SpringBootJdbc {

    private SpringBootJdbcService springBootJdbcService;

    @RequestMapping("/insertCustomer")
    public void insertCustomer(){
        String id = "cus_003";
        String address = "西安";
        String name= "张三";
        String phone = "13190004444";
        springBootJdbcService.insertCustomer(id,address,name,phone);
    }
}
