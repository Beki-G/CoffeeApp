package com.ss.coffee.CoffeeApp.mapper;

import com.ss.coffee.CoffeeApp.dto.receive.AddNewCoffeeDTO;
import com.ss.coffee.CoffeeApp.dto.send.CoffeeInfoDTO;
import com.ss.coffee.CoffeeApp.model.Coffee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    CoffeeMapper mapper = Mappers.getMapper(CoffeeMapper.class);

    Coffee mapToCoffee(AddNewCoffeeDTO newCoffeeDTO);
    CoffeeInfoDTO mapToCoffeeDTO(Coffee coffee);

    List<CoffeeInfoDTO> mapToListCoffeeDTO(List<Coffee> coffeeList);

}
