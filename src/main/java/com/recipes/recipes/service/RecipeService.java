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

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public int recipeRegistration(RecipeRegistrationDto recipeRegistrationDto, IngredientReqDto ingredientReqDto, SeasoningReqDto seasoningReqDto) {
        int successCount = 0;

        Recipe recipe = recipeRegistrationDto.toEntity();
        Ingredient ingredient = ingredientReqDto.toEntity();
        Seasoning seasoning = seasoningReqDto.toEntity();

        successCount += recipeMapper.saveRecipe(recipe);
        successCount += recipeMapper.saveIngredient(ingredient);
        successCount += recipeMapper.saveSeasoning(seasoning);

        return successCount;
    }
}
