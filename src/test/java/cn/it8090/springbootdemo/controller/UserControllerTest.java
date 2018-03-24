package cn.it8090.springbootdemo.controller;

import cn.it8090.springbootdemo.dao.UserDao;
import cn.it8090.springbootdemo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 21:34 2018/1/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration
public class UserControllerTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setName("张三");
        user.setAge(39);
        user.setId(2);
        userDao.save(user);
    }

}