package org.chris.exosolid.cas1;

class BankService {
    //    Effectuer un dépôt
    public double deposit(double amount, String accountNo) {
        return 0;
    }

    //    Retirer de l'argent
    public double withdraw(double amount, String accountNo) {
//        withdraw amount
        return 0;
    }

    //    Imprimer le relevé de compte Bancaire
    public void bankStatement() {

    }


    //    Envoyer une notification de OTP pour chaque type d'opération bancaire
//    Par email ou mobile ou whatsapp

    //La classe Bank service prend plusieurs responsabilités
    //Il faut créer des services différents
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related logic
        } else if (medium.equals("mobile")) {
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

    //    Envoyer une notification en guise de rapport pour chaque
//    Par email ou mobile ou whatsapp
    public void sendTransactionReport(String medium) {
        if (medium.equals("email")) {
            // write email related logic
        } else if (medium.equals("mobile")) {
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

}
