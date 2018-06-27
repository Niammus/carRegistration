package com.hexad.carRegistration.Services;

import com.hexad.carRegistration.Model.Driver;
import com.hexad.carRegistration.Repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Optional<Driver> getDriver(String name){
        return driverRepository.findByName(name);
    }

    public List<Driver> getDrivers(){
        return driverRepository.findAll();
    }

    public void createDriver(Driver driver){
        driverRepository.save(driver);
    }


}
