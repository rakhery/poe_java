package org.chris.payments;

import java.util.Scanner;

class PaymentServiceApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer le mode payment: 1:VISA) 2:PAYPAL 3:MASTERCARD):");
        int typePayment=scanner.nextInt();
        switch (typePayment){
            case 1-> new PaymentService(new Visa("4040040606006")).pay();
            case 2->new PaymentService(new PayPal("40400406888")).pay();
            case 3->new PaymentService(new MasterCard("22399444777")).pay();
            default -> System.out.println("Desolé vous n'avez pas effectué le choix");
        }

    }
}
