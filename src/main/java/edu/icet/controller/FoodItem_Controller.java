package edu.icet.controller;

import edu.icet.dto.Fooditem;
import edu.icet.entity.Food_itemEntity;
import edu.icet.service.Impl.FoodtemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/FoodIteme")
public class FoodItem_Controller {

    @Autowired
    FoodtemService foodtemService;

    @PostMapping("/add")
    public void add(@RequestBody Fooditem foodItem) {
        System.out.println(foodItem);
        foodtemService.add(foodItem);

    }
    @GetMapping("/{id}")
    public Long getById(@PathVariable Long id) {
       return foodtemService.getFoodItemById(id);
    }
    @PutMapping("update")
   public Food_itemEntity Update(@RequestBody Fooditem fooditem){
       return foodtemService.Update(fooditem);

   }
}
