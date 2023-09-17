package com.horizon.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horizon.restapi.entities.Customers;

public interface RepositorieCustomers extends JpaRepository<Customers, Long> {
    
}
