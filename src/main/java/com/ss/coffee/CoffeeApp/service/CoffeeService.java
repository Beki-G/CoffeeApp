package com.ss.coffee.CoffeeApp.service;

import com.ss.coffee.CoffeeApp.dto.receive.AddCoffeeStockDTO;
import com.ss.coffee.CoffeeApp.dto.receive.AddNewCoffeeDTO;
import com.ss.coffee.CoffeeApp.dto.send.CoffeeInfoDTO;
import com.ss.coffee.CoffeeApp.mapper.CoffeeMapper;
import com.ss.coffee.CoffeeApp.model.Coffee;
import com.ss.coffee.CoffeeApp.repository.CoffeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoffeeService {
    CoffeeRepo repo;
    CoffeeMapper mapper;

    public List<CoffeeInfoDTO> getAllCoffee(){
        List<Coffee> coffees = repo.findAll();
        System.out.println(coffees);
        return mapper.mapToListCoffeeDTO(coffees);
    }

    public CoffeeInfoDTO createNewCoffee(AddNewCoffeeDTO newCoffeeDTO){
        Coffee newCoffee = mapper.mapToCoffee(newCoffeeDTO);
        Coffee coffee = repo.save(newCoffee);
        return mapper.mapToCoffeeDTO(coffee);
    }

    public CoffeeInfoDTO addPoundsInStock(AddCoffeeStockDTO coffeeStockDTO){
        Coffee currentCoffee = repo.findById(coffeeStockDTO.getId()).orElseThrow();
        currentCoffee.setPoundsInStock(currentCoffee.getPoundsInStock()+coffeeStockDTO.getPounds());
        Coffee updatedCoffee = repo.save(currentCoffee);
        return mapper.mapToCoffeeDTO(updatedCoffee);
    }

    public void deleteCoffee(Long id){
        repo.deleteById(id);
    }
}
