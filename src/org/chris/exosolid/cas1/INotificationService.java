package org.chris.exosolid.cas1;
//Créer un interface pour respecter le principe de open/close
interface INotificationService {
    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);

}
