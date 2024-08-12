package com.recipes.recipes.repository;

import com.recipes.recipes.entity.FoodType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecipeOptionMapper {
    public List<FoodType> getFoodType();

}
