package com.hexad.carRegistration.Controllers;

import com.hexad.carRegistration.Model.Driver;
import com.hexad.carRegistration.Repositories.DriverRepository;
import com.hexad.carRegistration.Services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @RequestMapping(method = RequestMethod.GET)
    List<Driver> getDrivers(){
        return driverService.getDrivers();
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity createDriver(@RequestBody Driver driver){
        driverService.createDriver(driver);
        return ResponseEntity.ok().build();
    }




}
