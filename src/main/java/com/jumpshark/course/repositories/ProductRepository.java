package com.jumpshark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumpshark.course.entities.Category;
import com.jumpshark.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
