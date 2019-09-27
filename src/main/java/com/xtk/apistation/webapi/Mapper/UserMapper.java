package com.xtk.apistation.webapi.Mapper;


// import com.example.springboot.demo.bean.TST_User;
import com.xtk.apistation.webapi.bean.User;

import java.util.List;

public interface UserMapper {
    public User getById(int id);
    // --
    // public TST_User getById2(int id);
    // --
    public boolean insert(User record);;
    public List<User> getUsers(int p1, int p2);
    public boolean updateUser(User user);
    public boolean deleteUser(int id);
    public boolean deleteAllUsers();
}
