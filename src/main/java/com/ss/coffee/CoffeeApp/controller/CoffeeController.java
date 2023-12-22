package com.ss.coffee.CoffeeApp.controller;

import com.ss.coffee.CoffeeApp.dto.receive.AddCoffeeStockDTO;
import com.ss.coffee.CoffeeApp.dto.receive.AddNewCoffeeDTO;
import com.ss.coffee.CoffeeApp.dto.send.CoffeeInfoDTO;
import com.ss.coffee.CoffeeApp.service.CoffeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/coffee")
public class CoffeeController {

    CoffeeService service;

    @GetMapping
    List<CoffeeInfoDTO> getAllCoffee(){
        return service.getAllCoffee();
    }

    @PostMapping
    CoffeeInfoDTO addNewCoffee(AddNewCoffeeDTO newCoffee){
        return service.createNewCoffee(newCoffee);
    }

    @PutMapping
    CoffeeInfoDTO addCoffeeStock(AddCoffeeStockDTO addCoffee){
        return service.addPoundsInStock(addCoffee);
    }
}
