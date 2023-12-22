package com.ss.coffee.CoffeeApp.dto.send;

import lombok.Data;

@Data
public class CoffeeInfoDTO {
    String name;
    String origin;
    Long strength;
    Long poundsInStock;
}
