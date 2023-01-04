package com.proyectoab.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoab.proyecto.Model.CarSell;
import com.proyectoab.proyecto.Service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {

    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }
    @PostMapping("/CarSell/save")
    public void guardarCarSell(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }
    @PutMapping("/CarSell/update")
    public void actualizaCarSell(@RequestBody CarSell carSell){
         carSellService.updateCarSell(carSell);
    }
    @GetMapping("/CarSell/findCantidad/{cantidad}")
    public List<CarSell> findCarsell(@PathVariable int cantidad){
        return carSellService.buscaPorCantidad(cantidad);
    }  
    @DeleteMapping("/CarSell/eliminaCarSell/{id}")
    public void eliminaCarSell(@PathVariable Integer id){
        carSellService.eliminarCarSell(id);
    } 
}
