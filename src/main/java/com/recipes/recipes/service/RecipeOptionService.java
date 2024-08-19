package com.recipes.recipes.service;

import com.recipes.recipes.entity.*;
import com.recipes.recipes.repository.RecipeOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeOptionService {

    @Autowired
    private RecipeOptionMapper recipeOptionMapper;

    public List<FoodType> getFoodType() {
        return recipeOptionMapper.getFoodType();
    }

    public List<SituationType> getSituationType() {
        return recipeOptionMapper.getSituationType();
    }

    public List<IngredientType> getIngredientType() {
        return recipeOptionMapper.getIngredientType();
    }
    public List<WayType> getWayType() {
        return recipeOptionMapper.getWayType();
    }

    public List<Personnel> getPersonnel() {
        return recipeOptionMapper.getPersonnel();
    }
    public List<TakeTime> getTakeTime() {
        return recipeOptionMapper.getTakeTime();
    }
    public List<DifficultyLevel> getDifficultyLevel() {
        return recipeOptionMapper.getDifficultyLevel();
    }


}
