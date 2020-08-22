package com.bayloteam.baylo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bayloteam.baylo.model.TradeRequest;

public interface TradeRequestRepository extends JpaRepository<TradeRequest, Integer> {
	
	List<TradeRequest> findAllByWantItem_Owner_Id(final int wantItemOwnerId);
}

