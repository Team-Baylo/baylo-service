package com.bayloteam.baylo.service.impl;

import com.bayloteam.baylo.model.Trader;
import com.bayloteam.baylo.repository.TraderRepository;
import com.bayloteam.baylo.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraderServiceImpl implements TraderService {

    @Autowired
    private TraderRepository traderRepository;

    @Override
    public Trader getTrader(int id) {
        return traderRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
