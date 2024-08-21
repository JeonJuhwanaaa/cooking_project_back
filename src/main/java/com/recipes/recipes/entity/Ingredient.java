package com.recipes.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    private int ingredientId;
    private int recipeId;
    private String ingredientName;
    private String ingredientState;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
