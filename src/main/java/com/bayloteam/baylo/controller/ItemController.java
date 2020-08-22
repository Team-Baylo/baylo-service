package com.bayloteam.baylo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bayloteam.baylo.model.Item;
import com.bayloteam.baylo.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping(path = "/items/find-by-title", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> findAllByTitle(@RequestParam String title) {
		return itemService.findAllByTitle(title);
	}
	
	@GetMapping(path = "/items", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> findAll() {
		return itemService.findAll();
	}

	@PostMapping(path = "/item", produces = MediaType.APPLICATION_JSON_VALUE)
	public Item create(@RequestBody Item newItem) {
		return itemService.create(newItem);
	}
}
