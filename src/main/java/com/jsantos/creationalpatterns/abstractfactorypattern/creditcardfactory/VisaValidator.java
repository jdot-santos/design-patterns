package com.jsantos.creationalpatterns.abstractfactorypattern.creditcardfactory;

public class VisaValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
}
