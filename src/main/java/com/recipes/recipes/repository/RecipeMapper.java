package com.recipes.recipes.repository;

import com.recipes.recipes.entity.Ingredient;
import com.recipes.recipes.entity.Recipe;
import com.recipes.recipes.entity.Seasoning;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecipeMapper {

    public int saveRecipe(Recipe recipe);
    public int saveIngredient(Ingredient ingredient);
    public int saveSeasoning(Seasoning seasoning);

}
