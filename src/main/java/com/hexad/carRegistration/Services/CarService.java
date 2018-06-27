package com.hexad.carRegistration.Services;

import com.hexad.carRegistration.Model.Car;
import com.hexad.carRegistration.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void saveCar(Car car){
        carRepository.save(car);
    }

    public Optional<Car> getCar(String reg){
        return carRepository.findByReg(reg);
    }

    public List<Car> getCars(){
        return carRepository.findAll();
    }
}
