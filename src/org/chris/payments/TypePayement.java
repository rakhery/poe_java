package org.chris.payments;

enum TypePayement {
    VISA("Carte VISA"),
    MASTERCARD("MasterCard"),
    PAYPAL("PAYPAL");
    private String nom;
    TypePayement(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

}
