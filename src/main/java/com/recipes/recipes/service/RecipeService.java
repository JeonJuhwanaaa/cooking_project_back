package com.recipes.recipes.service;


import com.recipes.recipes.dto.RecipeRegistrationDto;
import com.recipes.recipes.entity.Recipe;
import com.recipes.recipes.repository.RecipeMapper;
import com.recipes.recipes.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public int recipeRegistration(RecipeRegistrationDto recipeRegistrationDto) {
        int successCount = 0;

        Recipe recipe = recipeRegistrationDto.toEntity();
        successCount += recipeMapper.saveRecipe(recipe);
        return successCount;
    }
}
