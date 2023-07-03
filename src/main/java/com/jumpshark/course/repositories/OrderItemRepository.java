package com.jumpshark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumpshark.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
