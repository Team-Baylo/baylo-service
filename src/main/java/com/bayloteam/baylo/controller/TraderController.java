package com.bayloteam.baylo.controller;

import java.util.List;

import com.bayloteam.baylo.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bayloteam.baylo.model.Item;
import com.bayloteam.baylo.model.Trader;
import com.bayloteam.baylo.service.ItemService;

@RestController
public class TraderController {

	@Autowired
	private TraderService traderService;

	@Autowired
	private ItemService itemService;

	@GetMapping(path = "/trader/{traderId}/items", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> getItems(@PathVariable int traderId) {
		return itemService.findByOwner(Trader.builder().id(traderId).build());
	}

	@GetMapping(path = "/trader/{traderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Trader get(@PathVariable int traderId) {
		return traderService.getTrader(traderId);
	}

}
