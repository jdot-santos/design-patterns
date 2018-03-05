package com.jsantos.creationalpatterns.abstractfactorypattern.creditcardfactory;

public class AmexPlatinumValidator implements Validator {
	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
}
