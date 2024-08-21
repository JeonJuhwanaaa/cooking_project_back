package com.recipes.recipes.dto;


import com.recipes.recipes.entity.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngredientReqDto {

    private int recipeId;
    private List<String> ingredientName;
    private List<String> ingredientState;

    public List<Ingredient> toEntity() {
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < ingredientName.size(); i++) {
            ingredients.add(Ingredient.builder()
                    .recipeId(recipeId)
                    .ingredientName(ingredientName.get(i))
                    .ingredientState(ingredientState.get(i))
                    .build());
        }
        System.out.println(ingredients);
        return ingredients;
    }
}
