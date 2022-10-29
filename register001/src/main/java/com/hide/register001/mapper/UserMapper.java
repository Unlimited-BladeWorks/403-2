package com.hide.register001.mapper;

import com.hide.register001.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("Insert into user (name,password)values(#{name},#{password})")
    void save(User user);
    @Select("Select * from user where name= #{name}")
    User findByName(String name);
    @Select("select password from user where name = #{name}")
    String findPswByName(String name);
    @Select("Select * from user where name=#{id}")
    List<User> findAll();
    @Select("Select * from user where name=#{name}")
    User getUserByName(String name);
}
