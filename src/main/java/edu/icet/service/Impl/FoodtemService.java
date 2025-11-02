package edu.icet.service.Impl;

import edu.icet.dto.Fooditem;
import edu.icet.entity.Food_itemEntity;

import java.util.List;


public interface FoodtemService {
    void add(Fooditem fooditem);

    List<Fooditem> getAll();

    Long getFoodItemById(Long id);

    Food_itemEntity Update(Fooditem fooditem);
}
