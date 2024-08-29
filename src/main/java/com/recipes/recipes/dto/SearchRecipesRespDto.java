package com.recipes.recipes.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchRecipesRespDto {
    private int recipeId;
    private int userId;
    private String recipeTitle;
    private String recipeMainImg;
    private String recipeIntro;
    private int foodTypeId;
    private int situationTypeId;
    private int ingredientTypeId;
    private int wayTypeId;
    private int takeTimeTypeId;
    private int personnelTypeId;
    private int difficultyLevelId;
    private String recipeTip;

    private List<String> ingredientName;
    private List<String> ingredientState;
    private List<String> seasoningName;
    private List<String> seasoningState;
    private List<String> stepNumber;
    private List<String> stepDescription;
    private List<String> stepPhotoUrl;
}
