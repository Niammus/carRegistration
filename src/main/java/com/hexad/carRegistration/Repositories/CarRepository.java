package com.hexad.carRegistration.Repositories;

import com.hexad.carRegistration.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByReg(String reg);
}