package com.bayloteam.Baylo.repository;

import com.bayloteam.Baylo.model.Item;
import com.bayloteam.Baylo.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByOwner(Trader owner);

}

