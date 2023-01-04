package com.proyectoab.proyecto.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoab.proyecto.Model.License;
import com.proyectoab.proyecto.Repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }
    public void saveLicense (License license){
        licenseRepository.save(license);
    }
    public void updateLicense (License license){
        licenseRepository.save(license);
    }
    public List<License> findAll(){
        return licenseRepository.findAll();
    }
    public List<License> buscaPorEstado(String estado){
        return licenseRepository.findAllLicenseEstatus(estado);
    }
    public List<License> buscaPorClase(String clase){
        return licenseRepository.findAllLicenseClase(clase);
    }
    public void eliminarLicencia(Integer id){
        licenseRepository.deleteById(id);
    }

}
