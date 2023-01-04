package com.proyectoab.proyecto.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoab.proyecto.Model.CarSell;
import com.proyectoab.proyecto.Repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository=carSellRepository;
    }
    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }
    public void updateCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }
    public List<CarSell> findAll(){
        return carSellRepository.findAll();
    }
    public List<CarSell> buscaPorCantidad(int cantidad){
        return carSellRepository.findAllCarSells(cantidad);
    }
    public void eliminarCarSell(Integer id){
        carSellRepository.deleteById(id);
    }
}
