package com.jsantos.behavioralpatterns.strategypattern.creditcardvalidator;

public class CreditCardValidatorDemo {


    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("346608434779693");
        amexCard.setDate("04/2020");
        amexCard.setCvv("354");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard invalidAmexCard = new CreditCard(new AmexStrategy());
        invalidAmexCard.setNumber("346608434779645");
        invalidAmexCard.setDate("04/2020");
        invalidAmexCard.setCvv("354");

        System.out.println("Is Amex valid: " + invalidAmexCard.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4716862131129587");
        visaCard.setDate("04/2020");
        visaCard.setCvv("354");

        System.out.println("Is Visa valid: " + visaCard.isValid());

    }
}
