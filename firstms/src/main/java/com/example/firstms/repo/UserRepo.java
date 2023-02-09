package com.example.firstms.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstms.model.User;


public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<List<User>> findByNickName(String nickName);
    Optional<List<User>> findByNickNameContainingIgnoreCase(String nickName);
    Optional<List<User>> findByAge(int age);
}
