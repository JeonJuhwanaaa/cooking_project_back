package com.recipes.recipes.service;


import com.recipes.recipes.dto.*;
import com.recipes.recipes.entity.Ingredient;
import com.recipes.recipes.entity.RecipeRegistration;
import com.recipes.recipes.entity.Seasoning;
import com.recipes.recipes.entity.Step;
import com.recipes.recipes.repository.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public int recipeRegistration(RecipeRegistrationDto recipeRegistrationDto) {
        int successCount = 0;

        RecipeRegistration recipeRegistration = recipeRegistrationDto.toEntity();
//        System.out.println(recipe);
        successCount += recipeMapper.saveRecipe(recipeRegistration);

//        System.out.println(successCount);
        return successCount;
    }
    public int ingredientRegistration(IngredientReqDto ingredientReqDto) {
        int successCount = 0;

        List<Ingredient> ingredients = ingredientReqDto.toEntity();
//        System.out.println(ingredients);
        for(Ingredient ingredient : ingredients) {
            successCount += recipeMapper.saveIngredient(ingredient);
        }
        return successCount;
    }

    public int seasoningRegistration(SeasoningReqDto seasoningReqDto) {
        int successCount = 0;

        List<Seasoning> seasonings = seasoningReqDto.toEntity();
//        System.out.println(seasonings);
        for(Seasoning seasoning : seasonings) {
            successCount += recipeMapper.saveSeasoning(seasoning);
        }
        return successCount;
    }

    public int stepRegistration(StepReqDto stepReqDto) {
        int successCount = 0;

        List<Step> steps = stepReqDto.toEntity();
        for(Step step : steps) {
            successCount += recipeMapper.saveStep(step);
        }
        return successCount;
    }

    public List<SearchRecipesRespDto> getRecipes() {
        List<RecipeRegistration> recipeRegistrations = recipeMapper.getAllRecipes();

        if (recipeRegistrations.isEmpty()) {
            return null; // 데이터가 없으면 null 반환
        }

        List<SearchRecipesRespDto> searchRecipes = new ArrayList<>(); // 결과를 저장할 리스트 생성

        for (RecipeRegistration recipeRegistration : recipeRegistrations) {
            SearchRecipesRespDto searchRecipe = recipeRegistration.toAllRecipeRespDto(); // 변환
            searchRecipe.setRecipeId(recipeRegistration.getRecipeId());
            searchRecipe.setUserId(recipeRegistration.getUserId());
            searchRecipe.setRecipeTitle(recipeRegistration.getRecipeTitle());
            searchRecipe.setRecipeMainImg(recipeRegistration.getRecipeMainImg());
            searchRecipe.setRecipeIntro(recipeRegistration.getRecipeIntro());

            searchRecipes.add(searchRecipe); // 리스트에 추가
        }

        System.out.println(searchRecipes); // 전체 리스트 출력

        return searchRecipes; // 전체 리스트 반환
    }

}
