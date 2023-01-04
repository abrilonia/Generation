package com.proyectoab.proyecto.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyectoab.proyecto.Model.User;
import com.proyectoab.proyecto.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;

    }
    @Override
    public User getUser(Integer id){
        //el optional es un tipo de lista
        //el repository viene con varias funcionalidades
        Optional <User> users = userRepository.findById(id);
        //el findbyId busca el user por el id de manera automatica
        //el orElse trae nulo en caso de que el id no exista,
        return users.orElse(null);

    }
    @Override
    public User save(User user){
        return userRepository.save(user);
        //el save inserta las columnas y los valores y allí guarda los datos
        //es una funcionalidad de repository y se hace de manera automatica/interna
    }
    @Override
    public void delete(Integer id){
        userRepository.deleteById(id);
        //el deletebyId lo que hace es un delete from user where id=id
    }
    @Override
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
}
