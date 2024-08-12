package com.recipes.recipes.service;

import com.recipes.recipes.entity.FoodType;
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


}
