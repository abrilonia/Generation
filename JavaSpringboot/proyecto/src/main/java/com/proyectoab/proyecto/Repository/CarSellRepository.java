package com.proyectoab.proyecto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectoab.proyecto.Model.CarSell;

public interface CarSellRepository extends JpaRepository<CarSell, Integer>{
    @Query(value= "Select * from generation1_schema.car_sell where cantidad=?1", nativeQuery = true)
    List<CarSell> findAllCarSells(int cantidad);
    
}
