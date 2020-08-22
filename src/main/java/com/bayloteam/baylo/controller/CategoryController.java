package com.bayloteam.baylo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bayloteam.baylo.model.Category;
import com.bayloteam.baylo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(path = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Category> getAll() {
		return categoryService.getAll();
	}

}
