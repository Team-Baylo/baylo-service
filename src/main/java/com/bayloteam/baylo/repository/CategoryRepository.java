package com.bayloteam.baylo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bayloteam.baylo.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> { }
