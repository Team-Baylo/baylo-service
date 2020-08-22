package com.bayloteam.baylo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bayloteam.baylo.model.TradeRequest;
import com.bayloteam.baylo.service.TradeRequestService;

@RestController
public class TradeRequestController {

	@Autowired
	private TradeRequestService tradeRequestService;

	@GetMapping(path = "/trade/{tradeRequestId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TradeRequest get(@PathVariable int tradeRequestId) {
		return tradeRequestService.get(tradeRequestId);
	}

	@GetMapping(path = "/trades/want-item/{ownerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TradeRequest> findByWantItemOwner(@PathVariable int wantItemOwnerId) {
		return tradeRequestService.findByWantItemOwner(wantItemOwnerId);
	}

	@PostMapping(path = "/trade", produces = MediaType.APPLICATION_JSON_VALUE)
	public TradeRequest create(@RequestBody TradeRequest tradeRequest) {
		return tradeRequestService.save(tradeRequest);
	}

	@PutMapping(path = "/trade/{tradeRequestId}/accept", produces = MediaType.APPLICATION_JSON_VALUE)
	public TradeRequest accept(@PathVariable int tradeRequestId) {
		return tradeRequestService.accept(tradeRequestId);
	}

}
