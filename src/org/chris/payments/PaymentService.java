package org.chris.payments;

class PaymentService {
    public IPayment payment;
    //Injection de dependance
    public PaymentService(IPayment p) {
        this.payment=p;
    }
    public void pay() {
        payment.processPayment();

    }
    public void setPayment(IPayment p){
        payment=p;
    }


}
