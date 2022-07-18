package org.chris.payments;

class PayPal implements IPayment {
        String desc;
        PayPal(String paypal){
            this.desc=paypal;
            System.out.println("Objet Paypal ");
        }

    @Override
    public void processPayment() {
        System.out.println("Payement VISA en cours");
    }
}


