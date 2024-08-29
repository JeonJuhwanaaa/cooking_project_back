package com.recipes.recipes.controller;

import com.recipes.recipes.dto.*;
import com.recipes.recipes.entity.Ingredient;
import com.recipes.recipes.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("/registration")
    public ResponseEntity<?> recipeRegistration(@RequestBody RecipeRegistrationDto recipeRegistrationDto) {
//        System.out.println(recipeRegistrationDto);
        return ResponseEntity.ok(recipeService.recipeRegistration(recipeRegistrationDto));
    }

    @PostMapping("/ingredient")
    public ResponseEntity<?> ingredientRegistration(@RequestBody IngredientReqDto ingredientReqDto) {
//        System.out.println(ingredientReqDto);
        return ResponseEntity.ok(recipeService.ingredientRegistration(ingredientReqDto));
    }

    @PostMapping("/seasoning")
    public ResponseEntity<?> seasoningRegistration(@RequestBody SeasoningReqDto seasoningReqDto) {
//        System.out.println(seasoningReqDto);
        return ResponseEntity.ok(recipeService.seasoningRegistration(seasoningReqDto));
    }

    @PostMapping("/step")
    public ResponseEntity<?> stepRegistration(@RequestBody StepReqDto stepReqDto) {
        return ResponseEntity.ok(recipeService.stepRegistration(stepReqDto));
    }

    @GetMapping("/allRecipes")
    public ResponseEntity<?> getRecipes() {
        return ResponseEntity.ok(recipeService.getRecipes());
    }
}
