package cn.it8090.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 18:41 2018/1/22
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","胡总");
        map.addAttribute("sex",1);
        List<String> users = new ArrayList<>();

        users.add("张三");
        users.add("李四");
        users.add("王五");

        map.addAttribute("users",users);
        return "index";
    }
}
