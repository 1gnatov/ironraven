package com.ironbank.moneyraven;

import com.ironbank.moneyraven.dao.MoneyDao;
import com.ironbank.moneyraven.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MoneyravenApplication {

	private MoneyDao moneyDao;

	public static void main(String[] args) {
		SpringApplication.run(MoneyravenApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Bank bank = new Bank();
		bank.setTotalAmount(500000);
		moneyDao.save(bank);
	}

	@Autowired
	public void setMoneyDao(MoneyDao moneyDao) {
		this.moneyDao = moneyDao;
	}
}
