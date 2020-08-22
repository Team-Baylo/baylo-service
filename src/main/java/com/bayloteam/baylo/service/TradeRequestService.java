package com.bayloteam.baylo.service;

import java.util.List;

import com.bayloteam.baylo.model.TradeRequest;

public interface TradeRequestService {

	TradeRequest get(int id);

	TradeRequest accept(int id);

	TradeRequest save(TradeRequest newTradeRequest);

	List<TradeRequest> findByWantItemOwner(int wantItemOwnerId);

}
