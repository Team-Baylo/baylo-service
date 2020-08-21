package com.bayloteam.Baylo.controller;

import com.bayloteam.Baylo.model.Category;
import com.bayloteam.Baylo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    List<Category> getAll() {
        return categoryService.getAll();
    }


}
