package com.generation.proyectouno.service;

import java.util.HashMap;
/*import java.util.List;*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.generation.proyectouno.model.User;

@Service
@Primary
public class UserServiceMap implements UserService{
    private Map <Integer, User> userMap = new HashMap<>();

    Collection<User> values = userMap.values();
        ArrayList<User> listOfValues = new ArrayList<>(values); 
        

    /*@Override
     public Map <Integer, User> getAllMap(){
        return userMap;
    }
    
    @Override
    public void put (Integer id, User user){
     userMap.put(id, user);   
    }

    @Override
    public void remove(Integer id, User user){
        userMap.remove(id, user); 

    }*/
    @Override
    public List<User> getAll(){
        Collection<User> values = userMap.values();
        ArrayList<User> listOfValues = new ArrayList<>(values);
        return listOfValues;

    }

    @Override
    public void add(User user){
        Integer key = user.getId();
        userMap.put(key,user);
    }

    @Override
    public void remove(User user){
        Integer key = user.getId();
        userMap.remove(key,user);
    }

    @Override 
    public int size(){
        return userMap.size();
    }

    @Override
    public User getUser(int position){
        return listOfValues.get(position);
    }


}
