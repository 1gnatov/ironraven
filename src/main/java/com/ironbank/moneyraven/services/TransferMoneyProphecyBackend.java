package com.ironbank.moneyraven.services;

import com.ironbank.moneyraven.dao.MoneyDao;
import com.ironbank.moneyraven.model.Bank;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferMoneyProphecyBackend implements TransferMoneyService {
	private final MoneyDao moneyDao;
	private final ProphetService prophetService;

	@Override
	public long transfer(String name, long amount) {
		Bank bank = moneyDao.findAll().get(0);
		if (bank.getTotalAmount() > amount && prophetService.willSurvive(name)) {
			bank.credit(amount);
			return moneyDao.save(bank).getTotalAmount();
		}
		return -1;
	}
}
