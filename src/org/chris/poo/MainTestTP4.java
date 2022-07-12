package org.chris.poo;

public class MainTestTP4 {
    public static void main(String[] args) {
        //Une souris blanche de 2 mois et pesant 50 grammes
       Souris sourisBlanche=new Souris(50,"blanche",2);
        //Une souris grise de 0 mois et pesant 45 grammes
        Souris sourisGrise=new Souris(45,"grise",0);
        //Une souris grise, clonée, de 0 mois et pesant 45 grammes
        Souris sourisGrisCloned=new Souris(sourisGrise);
        System.out.println(sourisBlanche);
        System.out.println(sourisGrisCloned);
        //Une souris blanche de 36 mois et pesant 50 grammes
        sourisBlanche.evoluer();
        System.out.println(sourisBlanche);
        //Une souris grise de 36 mois et pesant 45 grammes
        sourisGrise.evoluer();
        System.out.println(sourisGrise);
        //Une souris verte, clonée, de 28 mois et pesant 45 grammes
        //Evolution à partir de la souris gris clonée
        sourisGrisCloned.evoluer();
        sourisGrisCloned.veillir();
        System.out.println(sourisGrisCloned);

        //test age
        sourisBlanche.veillir();
        System.out.println(sourisBlanche);//37

    }
}
