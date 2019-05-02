package com.UserMapper;

import com.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public int insertUser(User user);
    public User getUser(@Param("id") int id);
    public List<User> getAll();

}
