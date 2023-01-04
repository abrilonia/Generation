package com.proyectoab.proyecto.Repository;

import org.springframework.data.repository.CrudRepository;

import com.proyectoab.proyecto.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
