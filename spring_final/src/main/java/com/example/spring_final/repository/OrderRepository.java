package com.example.spring_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_final.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    // Add custom queries if needed
}