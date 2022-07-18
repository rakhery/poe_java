package org.chris.payments;

public class MasterCard implements IPayment{
    String desc;
    MasterCard(String mastercard){
        this.desc=mastercard;
        System.out.println("Objet Mastercad");
    }

    @Override
    public void processPayment() {
        System.out.println("Payement Mastercard en cours");

    }

}
