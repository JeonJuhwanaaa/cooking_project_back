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
public class Seasoning {
    private int seasoningId;
    private int recipeId;
    private String seasoningName;
    private String seasoningState;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
