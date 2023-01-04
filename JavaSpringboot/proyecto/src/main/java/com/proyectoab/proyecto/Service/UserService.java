package com.proyectoab.proyecto.Service;

import java.util.List;

import com.proyectoab.proyecto.Model.User;

public interface UserService {

    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);

    List<User> getAllUsers();

;    
}
