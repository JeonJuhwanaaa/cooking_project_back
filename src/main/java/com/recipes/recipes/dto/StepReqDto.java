package com.recipes.recipes.dto;


import com.recipes.recipes.entity.Seasoning;
import com.recipes.recipes.entity.Step;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StepReqDto {
    private int recipeId;
    private List<Integer> stepNumber;
    private List<String> stepDescription;
    private List<String> stepPhotoUrl;

    public List<Step> toEntity() {
        List<Step> steps = new ArrayList<>();
        for (int i = 0; i < stepNumber.size(); i++) {
            steps.add(Step.builder()
                    .recipeId(recipeId)
                    .stepNumber(stepNumber.get(i))
                    .stepDescription(stepDescription.get(i))
                    .stepPhotoUrl(stepPhotoUrl.get(i))
                    .build());
        }
        return steps;
    }
}
