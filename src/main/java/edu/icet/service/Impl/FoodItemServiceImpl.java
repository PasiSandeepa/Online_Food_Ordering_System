package edu.icet.service.Impl;

import edu.icet.dto.Fooditem;
import edu.icet.entity.Food_itemEntity;
import edu.icet.repository.FoodItem_Repository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodItemServiceImpl implements FoodtemService {

    private final FoodItem_Repository foodItemRepository;
    private final ModelMapper modelMapper;

    @Override
    public void add(Fooditem fooditem) {
        Food_itemEntity foodItemEntity = modelMapper.map(fooditem, Food_itemEntity.class);
        foodItemRepository.save(foodItemEntity);
    }

    @Override
    public List<Fooditem> getAll() {
        // map all entities to DTOs
        return foodItemRepository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, Fooditem.class))
                .toList();
    }

    @Override
    public Long getFoodItemById(Long id) {
        Food_itemEntity entity = modelMapper.map(id,Food_itemEntity.class);
        return (entity != null) ? entity.getId() : null;
    }

    @Override
    public Food_itemEntity Update(Fooditem fooditem) {
        Food_itemEntity foodItem=modelMapper.map(fooditem,Food_itemEntity.class);
        foodItemRepository.save(foodItem);
        return foodItem;
    }
}
