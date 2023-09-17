package com.horizon.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizon.restapi.entities.Users;

public interface RepositorieUsers extends JpaRepository<Users, Long> {
    
}
