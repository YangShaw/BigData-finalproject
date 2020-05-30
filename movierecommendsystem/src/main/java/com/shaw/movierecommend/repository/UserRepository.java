package com.shaw.movierecommend.repository;

import com.shaw.movierecommend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);


}
