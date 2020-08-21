package com.bayloteam.Baylo.service.impl;

import com.bayloteam.Baylo.model.Item;
import com.bayloteam.Baylo.model.Trader;
import com.bayloteam.Baylo.repository.ItemRepository;
import com.bayloteam.Baylo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findByOwner(Trader owner) {
        return itemRepository.findByOwner(owner);
    }
}
