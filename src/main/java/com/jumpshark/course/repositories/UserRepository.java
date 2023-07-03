package com.jumpshark.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jumpshark.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
