package com.recipes.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DifficultyLevel {
    private int difficultyLevelId;
    private String difficultyLevel;
}
