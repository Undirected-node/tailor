package com.example.spring_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_final.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

}
