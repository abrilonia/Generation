package com.proyectoab.proyecto.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectoab.proyecto.Model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell, Integer> {

    @Query(value="Select * from generation1_schema.Buy_Sell where date = ?1", nativeQuery = true)
    List<BuySell> findAllBuySells(Date fechaCompra);
}
