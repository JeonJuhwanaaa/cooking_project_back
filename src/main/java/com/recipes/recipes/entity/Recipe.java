package com.recipes.recipes.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private int recipeId;
    private int userId;
    private String recipeTitle;
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
}
