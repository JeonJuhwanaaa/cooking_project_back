package com.recipes.recipes.dto;


import com.recipes.recipes.entity.Seasoning;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeasoningReqDto {
    private int recipeId;
    private String seasoningName;
    private String seasoningState;

    public Seasoning toEntity() {
        return Seasoning.builder()
                .recipeId(recipeId)
                .seasoningName(seasoningName)
                .seasoningState(seasoningState)
                .build();
    }
}
