package com.recipes.recipes.entity;


import com.recipes.recipes.dto.SearchRecipesRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeRegistration {
    private int recipeRegistrationId;
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
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    private Ingredient ingredient;
    private Seasoning seasoning;
    private User user;

    public SearchRecipesRespDto toAllRecipeRespDto() {
        SearchRecipesRespDto searchRecipe = new SearchRecipesRespDto();
        searchRecipe.setRecipeId(recipeId);
        searchRecipe.setUserId(userId);
        searchRecipe.setRecipeTitle(recipeTitle);
        searchRecipe.setRecipeMainImg(recipeMainImg);
        searchRecipe.setRecipeIntro(recipeIntro);

        return searchRecipe;
    }
}
