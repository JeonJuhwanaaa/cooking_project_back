package com.recipes.recipes.service;


import com.recipes.recipes.dto.IngredientReqDto;
import com.recipes.recipes.dto.RecipeRegistrationDto;
import com.recipes.recipes.dto.SeasoningReqDto;
import com.recipes.recipes.entity.Ingredient;
import com.recipes.recipes.entity.Recipe;
import com.recipes.recipes.entity.Seasoning;
import com.recipes.recipes.repository.RecipeMapper;
import com.recipes.recipes.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public int recipeRegistration(RecipeRegistrationDto recipeRegistrationDto, IngredientReqDto ingredientReqDto, SeasoningReqDto seasoningReqDto) {
        int successCount = 0;

        Recipe recipe = recipeRegistrationDto.toEntity();
//        System.out.println(recipe);
        successCount += recipeMapper.saveRecipe(recipe);

        // Save all ingredients
        List<Ingredient> ingredients = ingredientReqDto.toEntity();
        System.out.println(ingredients);
        for (Ingredient ingredient : ingredients) {
            successCount += recipeMapper.saveIngredient(ingredient);
        }

        // Save all seasonings
        List<Seasoning> seasonings = seasoningReqDto.toEntity();
        System.out.println(seasonings);
        for (Seasoning seasoning : seasonings) {
            successCount += recipeMapper.saveSeasoning(seasoning);
        }
        System.out.println(successCount);
        return successCount;
    }
    public int ingredientRegistration(IngredientReqDto ingredientReqDto) {
        int successCount = 0;

        List<Ingredient> ingredients = ingredientReqDto.toEntity();
        System.out.println(ingredients);
        for(Ingredient ingredient : ingredients) {
            successCount += recipeMapper.saveIngredient(ingredient);
        }
        return successCount;
    }
}
