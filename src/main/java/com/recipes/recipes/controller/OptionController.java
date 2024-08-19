package com.recipes.recipes.controller;

import com.recipes.recipes.service.RecipeOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe/options")
public class OptionController {

    @Autowired
    private RecipeOptionService recipeOptionService;

    @GetMapping("/foods")
    public ResponseEntity<?> getFoodType() {
        return ResponseEntity.ok(recipeOptionService.getFoodType());
    }

    @GetMapping("/situations")
    public ResponseEntity<?> getSituationType() {
        return ResponseEntity.ok(recipeOptionService.getSituationType());
    }

    @GetMapping("/ingredients")
    public ResponseEntity<?> getIngredientType() {
        return ResponseEntity.ok(recipeOptionService.getIngredientType());
    }

    @GetMapping("/ways")
    public ResponseEntity<?> getWayType() {
        return ResponseEntity.ok(recipeOptionService.getWayType());
    }

    @GetMapping("/personnels")
    public ResponseEntity<?> getPersonnel() {
        return ResponseEntity.ok(recipeOptionService.getPersonnel());
    }

    @GetMapping("/takeTimes")
    public ResponseEntity<?> getTakeTime() {
        return ResponseEntity.ok(recipeOptionService.getTakeTime());
    }

    @GetMapping("/difficultyLevels")
    public ResponseEntity<?> getDifficultyLevel() {
        return ResponseEntity.ok(recipeOptionService.getDifficultyLevel());
    }

}