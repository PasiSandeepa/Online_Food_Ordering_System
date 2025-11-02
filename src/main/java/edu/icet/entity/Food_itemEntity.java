package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "food_item_entity")
public class Food_itemEntity {
    private String name;

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer itemCode;
    private String description;
    private Double unitPrice;
    private Long id;
}