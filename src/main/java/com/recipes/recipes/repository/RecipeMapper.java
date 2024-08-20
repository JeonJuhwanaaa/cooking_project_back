package com.recipes.recipes.repository;

import com.recipes.recipes.entity.Recipe;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecipeMapper {

    public int saveRecipe(Recipe recipe);
}
