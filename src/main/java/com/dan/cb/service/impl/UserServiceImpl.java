package com.dan.cb.service.impl;  
  
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dan.cb.dao.IUserDao;
import com.dan.cb.pojo.User;
import com.dan.cb.service.IUserService;  
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    
    public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  