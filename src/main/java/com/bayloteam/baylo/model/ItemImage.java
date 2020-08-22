package com.bayloteam.baylo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class ItemImage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int status;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_id")
	private Item item;

}
