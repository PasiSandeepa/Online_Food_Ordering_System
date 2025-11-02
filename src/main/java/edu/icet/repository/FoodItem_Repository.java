package edu.icet.repository;

import edu.icet.entity.Food_itemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItem_Repository extends JpaRepository<Food_itemEntity,Integer> {

}
