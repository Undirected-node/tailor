package com.example.spring_final.service;

import com.example.spring_final.repository.OrderRepository;
import com.example.spring_final.model.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Orders> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public Optional<Orders> updateOrderStatus(Long id, String status) {
        return orderRepository.findById(id)
                .map(existingOrder -> {
                    existingOrder.setStatus(status);
                    return orderRepository.save(existingOrder);
                });
    }
}