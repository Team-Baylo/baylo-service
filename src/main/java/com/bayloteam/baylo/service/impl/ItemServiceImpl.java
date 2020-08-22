package com.bayloteam.baylo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bayloteam.baylo.model.Item;
import com.bayloteam.baylo.model.Trader;
import com.bayloteam.baylo.repository.ItemRepository;
import com.bayloteam.baylo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<Item> findByOwner(Trader owner) {
		return itemRepository.findByOwner(owner);
	}

	@Override
	public Item create(Item newItem) {
		return itemRepository.save(newItem);
	}

	@Override
	public List<Item> findAllByTitle(String title) {
		return itemRepository.findAllByTitleContainingIgnoreCase(title);
	}

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
}
