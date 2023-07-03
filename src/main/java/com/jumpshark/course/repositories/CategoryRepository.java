package com.jumpshark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumpshark.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
