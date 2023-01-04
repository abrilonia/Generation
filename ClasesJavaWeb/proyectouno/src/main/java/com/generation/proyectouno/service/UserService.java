package com.generation.proyectouno.service;

import java.util.List;
/* import java.util.Map; */

import com.generation.proyectouno.model.User;

public interface UserService {
    List <User> getAll();

    /* public Map <Integer, User> getAllMap(); */

    void add(User user);

    /* void put(Integer id, User user); */

    void remove (User user);

    /* void remove (Integer id, User user); */

    int size();

    User getUser(int position);
    
}
