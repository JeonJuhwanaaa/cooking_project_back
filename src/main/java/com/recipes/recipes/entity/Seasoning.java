package com.recipes.recipes.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seasoning {
    private int seasoningId;
    private int recipeId;
    private String seasoningName;
    private String seasoningState;
}
