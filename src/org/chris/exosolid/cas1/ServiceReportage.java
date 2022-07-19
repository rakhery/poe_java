package org.chris.exosolid.cas1;

public class ServiceReportage {
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
