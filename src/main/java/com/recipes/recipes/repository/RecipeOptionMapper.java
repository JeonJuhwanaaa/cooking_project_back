package com.recipes.recipes.repository;

import com.recipes.recipes.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecipeOptionMapper {
    public List<FoodType> getFoodType();
    public List<SituationType> getSituationType();
    public List<IngredientType> getIngredientType();
    public List<WayType> getWayType();

    public List<Personnel> getPersonnel();
    public List<TakeTime> getTakeTime();
    public List<DifficultyLevel> getDifficultyLevel();

}
