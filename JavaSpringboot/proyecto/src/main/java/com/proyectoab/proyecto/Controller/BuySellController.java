package com.proyectoab.proyecto.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
/* import org.springframework.web.bind.annotation.PatchMapping; */
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoab.proyecto.Model.BuySell;
import com.proyectoab.proyecto.Service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {

    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService){
        this.buySellService= buySellService;
    }
    @PostMapping("/BuySell/save")
    public void guardarBuySell(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }
    @PutMapping("/BuySell/update")
    public void actualizaBuySell(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);   
     }
     @GetMapping("/BuySell/findFechaCompra/{fechaCompra}")
     public List<BuySell> finBuySells(@PathVariable Date fechaCompra){
        return buySellService.buscaPorFechaCompra(fechaCompra);
     }
     @DeleteMapping("/BuySell/eliminaBuySell/{id}")
     public void eliminaBuySell(@PathVariable Integer id){
        buySellService.eliminarBuySell(id);
     }
}
