package com.recipes.recipes.dto;


import com.recipes.recipes.entity.Seasoning;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeasoningReqDto {
    private int recipeId;
    private List<String> seasoningName;
    private List<String> seasoningState;

    public List<Seasoning> toEntity() {
        List<Seasoning> seasonings = new ArrayList<>();
        for (int i = 0; i < seasoningName.size(); i++) {
            seasonings.add(Seasoning.builder()
                    .recipeId(recipeId)
                    .seasoningName(seasoningName.get(i))
                    .seasoningState(seasoningState.get(i))
                    .build());
        }
        return seasonings;
    }
}
