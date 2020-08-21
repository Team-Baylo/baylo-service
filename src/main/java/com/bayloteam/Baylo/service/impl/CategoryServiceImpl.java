package com.bayloteam.Baylo.service.impl;

import com.bayloteam.Baylo.model.Category;
import com.bayloteam.Baylo.repository.CategoryRepository;
import com.bayloteam.Baylo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
