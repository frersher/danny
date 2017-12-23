package com.dan.cb.dao;

import com.dan.cb.pojo.User;

public interface IUserDao {



    User selectByPrimaryKey(Integer id);

}