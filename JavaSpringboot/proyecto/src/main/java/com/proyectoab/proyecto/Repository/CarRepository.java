package com.proyectoab.proyecto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectoab.proyecto.Model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
    //con native query le dejamos claro a java que es un lenguaje nativo y que no debe interpretarlo
    @Query(value= "Select * from car where marca = ?1", nativeQuery = true)
    List<Car> findAllAutoMarca(String marca);

    @Query(value= "Select * from car where color = ?1", nativeQuery = true)
    List<Car> findAllAutoColor(String color);

    @Query(value="Select * from car where color = ?1 and marca= ?2", nativeQuery = true)
    List<Car> findAllAutoColorMarca(String color, String marca);


//se debe escribir mas abreviado, para que sea más directo 
    @Query(value= "select * from car c join c.carsell cs", nativeQuery= true)
    List<Car> buscarAutosVendidos();
    
}
