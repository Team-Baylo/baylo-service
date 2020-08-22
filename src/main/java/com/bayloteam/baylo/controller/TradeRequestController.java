package com.bayloteam.baylo.controller;

import com.bayloteam.baylo.model.TradeRequest;
import com.bayloteam.baylo.service.TradeRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeRequestController {

    @Autowired
    private TradeRequestService tradeRequestService;

    @GetMapping(path = "/trade/{tradeRequestId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TradeRequest get(@PathVariable int tradeRequestId) {
        return tradeRequestService.get(tradeRequestId);
    }

    @PostMapping(path = "/trade", produces = MediaType.APPLICATION_JSON_VALUE)
    public TradeRequest create(@RequestBody TradeRequest tradeRequest) {
        return tradeRequestService.save(tradeRequest);
    }

    @PutMapping(path = "/trade", produces = MediaType.APPLICATION_JSON_VALUE)
    public TradeRequest update(@RequestBody TradeRequest tradeRequest) {
        return tradeRequestService.save(tradeRequest);
    }

}
