package com.proyectoab.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/* import org.springframework.stereotype.Controller; */
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoab.proyecto.Model.License;
import com.proyectoab.proyecto.Service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {

    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService){
        this.licenseService = licenseService;
    }
    @PostMapping("/License/save")
    public void guardarLicense(@RequestBody License license){
        licenseService.saveLicense(license);
    }
    @PutMapping("/License/update")
    public void actualizarLicencia(@RequestBody License license){
        licenseService.updateLicense(license);
    }
    @GetMapping("/License/findEstado/{estado}")
    public List<License> findEstado(@PathVariable String estado){
        return licenseService.buscaPorEstado(estado);
    }
    @GetMapping("/License/findClase/{clase}")
    public List<License> findClase(@PathVariable String clase){
        return licenseService.buscaPorClase(clase);
    }
    @DeleteMapping("/License/eliminarLicencia/{id}")
    public void eliminarLicencia (@PathVariable Integer id){
        licenseService.eliminarLicencia(id);
    }
}
