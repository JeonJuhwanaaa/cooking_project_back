package com.recipes.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Step {
    private int stepId;
    private int recipeId;
    private int stepNumber;
    private String stepDescription;
    private String stepPhotoUrl;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
