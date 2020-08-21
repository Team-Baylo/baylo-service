package com.bayloteam.Baylo.controller;

import com.bayloteam.Baylo.model.Item;
import com.bayloteam.Baylo.model.Trader;
import com.bayloteam.Baylo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TraderController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/trader/{traderId}/items")
    List<Item> getItems(@PathVariable int traderId) {
        return itemService.findByOwner(Trader.builder().id(traderId).build());
    }

}
