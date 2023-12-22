package com.ss.coffee.CoffeeApp.repository;

import com.ss.coffee.CoffeeApp.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepo extends JpaRepository<Coffee, Long> {
}
