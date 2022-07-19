package org.chris.exosolid.cas1;

public class ServiceEmailNotification implements INotificationService{
    @Override
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related logic
        } else if (medium.equals("mobile")) {
            //  write SMS related logic
        } else if (medium.equals("whatsapp")) {
            //  write Whatsapp related logic
        }
    }

    @Override
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
