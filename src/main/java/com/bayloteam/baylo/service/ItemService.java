package com.bayloteam.baylo.service;

import java.util.List;

import com.bayloteam.baylo.model.Item;
import com.bayloteam.baylo.model.Trader;

public interface ItemService {

	List<Item> findByOwner(Trader owner);

	Item create(Item newItem);

	List<Item> findAllByTitle(String title);
	
	List<Item> findAll();

}
