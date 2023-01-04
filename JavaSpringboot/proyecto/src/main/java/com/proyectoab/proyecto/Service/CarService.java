package com.proyectoab.proyecto.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectoab.proyecto.Model.Car;
import com.proyectoab.proyecto.Repository.CarRepository;

@Service
@Transactional
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    
    public void saveCar (Car car){
        carRepository.save(car);
    }

    public void updateCar (Car car){
        carRepository.save(car);
        
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }
    public List<Car> buscarPorMarca(String marca){
        return carRepository.findAllAutoMarca(marca);
    }
    public List<Car> buscarPorColor(String color){
        return carRepository.findAllAutoColor(color);
    }
    public List<Car> buscarPorColorMarca(String color, String marca){
        return carRepository.findAllAutoColorMarca(color, marca);
    }
    public void eliminarAuto(Integer id){
        carRepository.deleteById(id);
    }
}
