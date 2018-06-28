package com.hexad.carRegistration;

import com.hexad.carRegistration.Controllers.CarController;
import com.hexad.carRegistration.Model.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@RunWith(SpringRunner.class)
@SpringBootTest
public class sidewalkApplicationTests {

	@Autowired
	private CarController carController;

	@Test
	public void contextLoads() {
		List<Car> list = carController.getCar();
		assertTrue(list.size()>0);
	}

    @Test
    public void functionalProgramming(){
        List<Car> list = carController.getCar();
        Set<Car> set = list.stream().filter(e-> e.getMake().equals("BMW")).collect(Collectors.toSet());
        List<String> reg = list.stream().map(e -> e.getReg()).collect(Collectors.toList());
        reg.forEach(e -> System.out.println(e));
        System.out.println(set.size());
        assertTrue(list.size() > 0);
    }



}
