package com.jsantos.creationalpatterns.abstractfactorypattern.creditcardfactory;

public class CreditCardFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);

		CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);

		System.out.println(creditCard.getClass());

		abstractFactory = CreditCardFactory.getCreditCardFactory(600);

		CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.GOLD);

		System.out.println(creditCard2.getClass());
	}
}
