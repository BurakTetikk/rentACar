package com.brkttk.rentACar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarWithCategoryDto {
    private int id;
    private String marka;
    private String categoryName;

}
