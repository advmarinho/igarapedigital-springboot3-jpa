package com.igarapedigital.webcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igarapedigital.webcurso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
