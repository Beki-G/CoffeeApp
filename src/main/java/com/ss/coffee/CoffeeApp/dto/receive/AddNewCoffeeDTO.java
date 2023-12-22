package com.ss.coffee.CoffeeApp.dto.receive;

import lombok.Data;

@Data
public class AddNewCoffeeDTO {
    String name;
    String origin;
    Long strength;
    Double basePrice;
    Long poundsInStock;
}
