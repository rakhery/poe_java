package org.chris.gestion;
import java.util.ArrayList;


public class TP5Test {
    public static void main(String[] args){
        System.out.println("Gestion du personnel");
        Gestion gestion=new Gestion("CLB Institut of technology");
        gestion.ajouter(new Secretaire("Secrétaire","Christiane Lisangolanne",2005,"Chimie",5000));
        gestion.ajouter(new Etudiant("Etudiant regulier","Chris Lisangola",2013,"Physique",15));
        gestion.ajouter(new Etudiant("Etudiant regulier","Jihane Cheddadi",2011,"Math informatique",15));
        gestion.ajouter(new EtudiantEchange("Etudiant d'echange","Paris 40","Bjorn cote de fer",2012,"Physique"));
        gestion.ajouter(new Enseignant("Enseignant","Zinedine Benzema",1998,"Physique",2000,"Physique"));
        //affichage du nombre de personnes qui fréquentent CLBIT
        //dont le nombre d'étudiants.
        System.out.println("Nombre Etudiant:"+gestion.getNombreEtudiant());

        /*Affichage des informations stockées sur chaque personne
        vous définirez une méthode estEtudiant retournant true pour les étudiants et false pour tous les autre*/
        gestion.afficher();


    }
}
