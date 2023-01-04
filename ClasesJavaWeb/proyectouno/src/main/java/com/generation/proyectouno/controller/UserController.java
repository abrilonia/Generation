package com.generation.proyectouno.controller;

import java.util.List;

/*import java.util.List;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.proyectouno.model.User;
import com.generation.proyectouno.service.UserService;
/* import java.util.Map; */

@RestController
public class UserController {

    public UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService = userService;
        userService.add(new User(1,"Juan", "Barrias"));
        userService.add(new User(2,"Abril", "Bracamonte"));
        /* userService.put(3, new User(3, "Maria", "Torrez")); */
    }
    
    /* @GetMapping("/user")
    public List <User> getUser(){
        return userService.getUser(0);
    } */

    @GetMapping("/userAll")
    public List <User> getAll(){
        return userService.getAll();
    }
    /* @GetMapping("/AllUserMap")
    public Map <Integer, User> getAllUser(){
        return userService.getAllMap();
    } */
    //se instancia el mapping y se crea el url --> Path == url
    //para obtener los datos del path se ocupa @PathVariable
    //Para ocuparlo se debe entregar el nombre del parametro entre {} para que este se modifique despues y no sea estatico
    @GetMapping("/addUser/{id}/{nombre}/{appellido}")
    //aqui se llama la variable segun el nombre que se puso entre {}
    public void addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("appellido") String appellido){
        userService.add(new User(id,nombre,appellido));
    }
    @GetMapping("/findUser/{id}")
    public void findUser(@PathVariable("id") int id){
        userService.getUser(id);
    }

}
