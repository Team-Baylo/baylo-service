package com.bayloteam.baylo.repository;

import com.bayloteam.baylo.model.Category;
import com.bayloteam.baylo.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraderRepository extends JpaRepository<Trader, Integer> {}
