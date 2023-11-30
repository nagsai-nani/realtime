package com.it.realtime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.realtime.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
