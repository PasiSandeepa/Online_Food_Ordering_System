package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Fooditem {
    private  String name;
    private Integer itemCode;
    private String description;
    private Double unitPrice;
    private Long id;

}
