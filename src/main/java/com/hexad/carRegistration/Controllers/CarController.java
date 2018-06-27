package com.hexad.carRegistration.Controllers;


import com.hexad.carRegistration.Model.Car;
import com.hexad.carRegistration.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getCar(){
        return carService.getCars();
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity create (@RequestBody Car car){
        carService.saveCar(car);
        return ResponseEntity.ok().build();
    }


}
