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
}
