package com.bayloteam.baylo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bayloteam.baylo.model.Item;
import com.bayloteam.baylo.model.Trader;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	List<Item> findByOwner(Trader owner);

	List<Item> findAllByTitleContainingIgnoreCase(String title);
}
