package com.bayloteam.Baylo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Data
@Entity
public class TradeRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "trade_item_id", referencedColumnName = "id")
    private Item tradeItem;

    @OneToOne
    @JoinColumn(name = "want_item_id", referencedColumnName = "id")
    private Item wantItemId;

    private int status;

}
