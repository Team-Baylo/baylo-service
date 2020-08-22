package com.bayloteam.baylo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bayloteam.baylo.model.Category;
import com.bayloteam.baylo.repository.CategoryRepository;
import com.bayloteam.baylo.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }
}
