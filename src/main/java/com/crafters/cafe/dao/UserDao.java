package com.crafters.cafe.dao;

import com.crafters.cafe.POJO.User;
import com.crafters.cafe.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    public User findByEmailId(@Param("email") String email);


    public List<UserWrapper> getAllUser();

    @Transactional
    @Modifying
    public Integer updateStatus(@Param("status") String status, @Param("id") Integer id);

    public List<String> getAllAdmin();

    public User findByEmail(String email);


}


