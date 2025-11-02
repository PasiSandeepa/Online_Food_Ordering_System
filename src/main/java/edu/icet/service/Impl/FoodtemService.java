package edu.icet.service.Impl;

import edu.icet.dto.Fooditem;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoodtemService {
    void add(Fooditem fooditem);
    List<Fooditem> getAll();

    Long getFoodItemById(Long id);
}
