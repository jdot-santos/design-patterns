package com.jsantos.creationalpatterns.abstractfactorypattern.creditcardfactory;

public class AmexGoldValidator implements Validator {
	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
}
