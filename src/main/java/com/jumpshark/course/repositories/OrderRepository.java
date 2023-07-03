package com.jumpshark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumpshark.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
