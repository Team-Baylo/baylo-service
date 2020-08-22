package com.bayloteam.baylo.service.impl;

import com.bayloteam.baylo.model.TradeRequest;
import com.bayloteam.baylo.repository.TradeRequestRepository;
import com.bayloteam.baylo.service.TradeRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeRequestServiceImpl implements TradeRequestService {

    @Autowired
    private TradeRequestRepository tradeRequestRepository;


    @Override
    public TradeRequest get(int id) {
        return tradeRequestRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @Override
    public TradeRequest save(TradeRequest tradeRequest) {
        return tradeRequestRepository.save(tradeRequest);
    }

}
