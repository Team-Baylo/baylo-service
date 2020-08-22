package com.bayloteam.Baylo.service;

import java.util.List;

import com.bayloteam.Baylo.model.Item;
import com.bayloteam.Baylo.model.Trader;

public interface ItemService {

    List<Item> findByOwner(Trader owner);

}
