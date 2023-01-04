package com.proyectoab.proyecto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectoab.proyecto.Model.License;

public interface LicenseRepository extends JpaRepository<License, Integer> {
    @Query(value="Select * from license where estado = ?1", nativeQuery = true)
    List<License> findAllLicenseEstatus(String estado);

    @Query(value="Select * from license where clase = ?1", nativeQuery = true)
    List<License> findAllLicenseClase(String clase);
}
