package com.recipes.recipes.dto;


import com.recipes.recipes.entity.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngredientReqDto {

    private int recipeId;
    private String ingredientName;
    private String ingredientState;

    public Ingredient toEntity() {
        return Ingredient.builder()
                .recipeId(recipeId)
                .ingredientName(ingredientName)
                .ingredientState(ingredientState)
                .build();
    }
}
