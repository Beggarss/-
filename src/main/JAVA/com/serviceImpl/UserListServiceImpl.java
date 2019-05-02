package com.serviceImpl;

import com.model.User;
import com.service.UserListService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserListServiceImpl implements UserListService {
    @Autowired
    private UserService userService=null;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int insertUserList(List<User> list) {
        int count=0;
        for(User user:list){
            count+=userService.insertUser(user);
        }
        return count;
    }
}
