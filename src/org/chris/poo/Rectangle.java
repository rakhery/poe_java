package org.chris.poo;

public class Rectangle {

    private double longeur;
    private double largeur;

    public Rectangle() {
    }

    public Rectangle(double longeur, double largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public double getLargeur() {
        return largeur;
    }



    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }



    public double calculPerimetre(){
        return 2*(longeur+largeur);
    }
    public double calculAir(){
        return longeur*largeur;
    }
}
