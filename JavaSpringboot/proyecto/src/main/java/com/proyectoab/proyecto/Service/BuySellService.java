package com.proyectoab.proyecto.Service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoab.proyecto.Model.BuySell;
import com.proyectoab.proyecto.Repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {
    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }
    public void saveBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }
    public void updateBuySell(BuySell buySell){
        buySellRepository.save(buySell);
    }
    public List<BuySell> findAll(){
        return buySellRepository.findAll();
    }
    public List<BuySell> buscaPorFechaCompra(Date fechaCompra){
        return buySellRepository.findAllBuySells(fechaCompra);
    }
    public void eliminarBuySell(Integer id){
        buySellRepository.deleteById(id);
    }
}
