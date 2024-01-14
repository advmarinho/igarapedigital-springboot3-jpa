package com.igarapedigital.webcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igarapedigital.webcurso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
