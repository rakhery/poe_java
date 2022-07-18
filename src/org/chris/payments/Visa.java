package org.chris.payments;

class Visa implements IPayment {
    String desc;
    Visa(String visa){
        this.desc=visa;
        System.out.println("Objet Visa créer");
    }

    @Override
    public void processPayment() {
        System.out.println("Payement VISA en cours");
    }
}
