package org.chris.poo;

import java.util.Scanner;

public class MainTestTP2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nom:");
        String nom=scanner.nextLine();
        System.out.println("Prénom:");
        String prenom=scanner.nextLine();
        System.out.println("Marié(e) True ou False:");
        boolean isMarried=scanner.nextBoolean();
        System.out.println("Nombre enfants:");
        int nbrEnfant=scanner.nextInt();
        Personne personne=new Personne(nom,prenom,nbrEnfant,isMarried);
        personne.afficher();
    }
}
