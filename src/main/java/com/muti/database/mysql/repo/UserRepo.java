package com.muti.database.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muti.database.mysql.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUser(String title);

}
