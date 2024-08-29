package com.recipes.recipes.repository;

import com.recipes.recipes.entity.Ingredient;
import com.recipes.recipes.entity.RecipeRegistration;
import com.recipes.recipes.entity.Seasoning;
import com.recipes.recipes.entity.Step;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecipeMapper {

    public int saveRecipe(RecipeRegistration recipeRegistration);
    public int saveIngredient(Ingredient ingredient);
    public int saveSeasoning(Seasoning seasoning);
    public int saveStep(Step step);

    public List<RecipeRegistration> getAllRecipes();

}
