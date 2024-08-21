package com.recipes.recipes.controller;

import com.recipes.recipes.dto.IngredientReqDto;
import com.recipes.recipes.dto.RecipeRegistrationDto;
import com.recipes.recipes.dto.SeasoningReqDto;
import com.recipes.recipes.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @PostMapping("/registration")
    public ResponseEntity<?> recipeRegistration(@RequestBody RecipeRegistrationDto recipeRegistrationDto, IngredientReqDto ingredientReqDto, SeasoningReqDto seasoningReqDto) {
        return ResponseEntity.ok(recipeService.recipeRegistration(recipeRegistrationDto, ingredientReqDto, seasoningReqDto));
    }
}
