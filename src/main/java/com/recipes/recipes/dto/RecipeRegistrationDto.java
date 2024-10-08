package com.recipes.recipes.dto;

import com.recipes.recipes.entity.RecipeRegistration;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeRegistrationDto {
    private int recipeId;
    private int userId;
    private String recipeTitle;
    private String recipeMainImg;
    private String recipeIntro;
    private int foodTypeId;
    private int situationTypeId;
    private int ingredientTypeId;
    private int wayTypeId;
    private int takeTimeId;
    private int personnelId;
    private int difficultyLevelId;
    private String recipeTip;

    public RecipeRegistration toEntity() {
        return RecipeRegistration.builder()
                .recipeId(recipeId)
                .userId(userId)
                .recipeTitle(recipeTitle)
                .recipeMainImg(recipeMainImg)
                .recipeIntro(recipeIntro)
                .foodTypeId(foodTypeId)
                .situationTypeId(situationTypeId)
                .ingredientTypeId(ingredientTypeId)
                .wayTypeId(wayTypeId)
                .takeTimeId(takeTimeId)
                .personnelId(personnelId)
                .difficultyLevelId(difficultyLevelId)
                .recipeTip(recipeTip)
                .build();
    }

}