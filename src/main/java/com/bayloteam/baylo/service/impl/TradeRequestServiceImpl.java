package com.bayloteam.baylo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bayloteam.baylo.model.TradeRequest;
import com.bayloteam.baylo.repository.TradeRequestRepository;
import com.bayloteam.baylo.service.TradeRequestService;

@Service
public class TradeRequestServiceImpl implements TradeRequestService {

    @Autowired
    private TradeRequestRepository tradeRequestRepository;


    @Override
    public TradeRequest get(int id) {
        return tradeRequestRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @Override
    public TradeRequest accept(int id) {
        TradeRequest tradeRequest = get(id);
        tradeRequest.setStatus(2);
        return save(tradeRequest);
    }

    @Override
    public TradeRequest save(TradeRequest tradeRequest) {
        return tradeRequestRepository.save(tradeRequest);
    }

	@Override
	public List<TradeRequest> findByWantItemOwner(int wantItemOwnerId) {
		return tradeRequestRepository.findAllByWantItem_Owner_Id(wantItemOwnerId);
	}

}
