package com.springboot.ceshi.dao;


import com.springboot.ceshi.mapper.UserMappper;
import com.springboot.ceshi.model.Product;
import com.springboot.ceshi.model.User;
import com.springboot.ceshi.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by youfan on 2018/6/6 0006.
 */
@Component
public class UserDao {

    @Autowired
    UserMappper userMappper;

    public void inseruserInfo(User user){
        userMappper.inseruserInfo(user);
    }

    public User findByUserid(int id){
        return userMappper.findByUserid(id);
    }
    public List<User> findAll(){
        return userMappper.findAll();
    }
    public List<Product> findAllProduct(){
        return userMappper.findAllProduct();
    }
    public Product findProductByid(int id){
        return userMappper.findProductByid(id);
    }
    public void deleteUser(int id){
        userMappper.deleteUser(id);
    }





}
