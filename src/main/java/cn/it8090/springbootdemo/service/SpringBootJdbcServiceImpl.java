package cn.it8090.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @PoweredBy Amour Mars
 * @Date 19:40 2018/1/22
 */
@Service
@Transactional
public class SpringBootJdbcServiceImpl implements SpringBootJdbcService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertCustomer(String id, String address, String name, String phone) {
        jdbcTemplate.update("insert into customer values(?,?,?,?)",id,address,name,phone);
    }
}
