package cn.it8090.springbootdemo.controller;

import cn.it8090.springbootdemo.dao.UserDao;
import cn.it8090.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 20:48 2018/1/22
 */
@RestController

public class UserController {

    @Autowired
    private UserDao userDao;

    /**
      * FOR: spring-boot整合jpa------保存
      * @Author:
      * @Date:
      */
    @RequestMapping("/save")
    public void save(User user){
        user.setName("张三");
        user.setAge(39);
        user.setId(1);
        userDao.save(user);
    }




}
