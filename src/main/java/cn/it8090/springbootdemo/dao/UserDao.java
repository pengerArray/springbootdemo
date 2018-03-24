package cn.it8090.springbootdemo.dao;


import cn.it8090.springbootdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 20:39 2018/1/22
 */
public interface UserDao extends JpaRepository<User,Integer> { }
