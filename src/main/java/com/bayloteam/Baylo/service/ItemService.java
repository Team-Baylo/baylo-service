package com.bayloteam.Baylo.service;

import com.bayloteam.Baylo.model.Item;
import com.bayloteam.Baylo.model.Trader;

import java.util.List;

public interface ItemService {

    List<Item> findByOwner(Trader owner);

}
