package com.ironbank.moneyraven.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Bank {

	@Id long id;
	private long totalAmount;

	public void credit(long amount) {
		this.totalAmount -= amount;
	}
}
