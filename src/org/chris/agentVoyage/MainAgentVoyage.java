package org.chris.agentVoyage;

public class MainAgentVoyage {
    public static void main(String[] args) {
       /* KitVoyage kitVoyage=new KitVoyage("Paris","Tokyo");
        OptionVoyage singapour=new Sejour("Hotel Singapour",2000.0,3,500);
        OptionVoyage avion=new Transport("A380",2000,true);
        kitVoyage.ajouterOption(singapour );
        kitVoyage.ajouterOption(avion);
        System.out.println(kitVoyage);
        //Effacer
        kitVoyage.annuler();
        System.out.println(kitVoyage);*/


        KitVoyage maroc=new KitVoyage("Tours","Marrakech");
        OptionVoyage ryanair=new Transport("Ryanair Aller-Retour",208,true);
        OptionVoyage hebergement1=new Sejour("Wazo Hotel",102.50,3,102);
        OptionVoyage chameau=new Transport("Chameaux dans le desert",50,false);
        OptionVoyage hebergement2=new Sejour("Hotel Casablanca",250.50,3,102);
        maroc.ajouterOption(ryanair);
        maroc.ajouterOption(hebergement1);
        maroc.ajouterOption(chameau);
        maroc.ajouterOption(hebergement2);
        System.out.println(maroc);

    }
}
