package com.example.demo.service.imp;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Long id,String name, Integer age) {
        jdbcTemplate.update("insert into USER(ID,NAME,AGE) values(?,?,?)",id, name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from USER where NAME =?",name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(*) from USER",Integer.class);
    }


    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from USER");
    }

    @Override
    public Integer getTheUser(String name) {
        return jdbcTemplate.queryForObject("select count(*) from ysf_corporation",Integer.class);
    }

    @Override
    public void createTable(){
        String sql = "CREATE TABLE USER(name varchar(255),age int)";
        jdbcTemplate.update(sql);
    }

//    public static void main(String[] args) {
//        UserServiceImpl u = new UserServiceImpl();
//        u.create("a",1);
//        System.out.println(u.getAllUsers());
//    }
}
