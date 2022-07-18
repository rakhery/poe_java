package org.chris.gestion;

import java.util.ArrayList;

/**
 * @Formateur :attention pendant la concept° pour respecter
 *  le prncpe SOLID
 * Single Responsability 1 seule responsabilité
 * O open/close
 * L Liskov substitution
 * Interface segregation
 * Dependence Injection
 *
 *
 * ex:Dev RH
 *
 * acteurs: devops, chef projet(problème listframework), dev(lagange, listframework)
 * phase-1 créer des classes
 * phase-2 refactoriser evoluer les classes durant la concept°, créer des sous classes
 * Quelle les rôles des dev ?
 * dev frontend et dev backend
 * Eviter de dupliquer inutiles pour u dev fullstack
 * Imposer Interface
 *
 *class Employee
 *
 *
 *
 */
public class Gestion {
    private String description;
    private ArrayList<Personne> personnes;
    public Gestion(String desc) {
        this.description=desc;
        this.personnes=new ArrayList<>();
    }

    public void ajouter(Secretaire secretaire) {
        personnes.add(secretaire);
    }

    public void ajouter(Etudiant etudiant) {
        personnes.add(etudiant);
    }

    public void ajouter(Enseignant enseignant) {
        personnes.add(enseignant);
    }
    //En utilisant stream
    public int getNombreEtudiant(){
        int nbrEtudiants= (int) personnes.stream().filter(e ->e instanceof Etudiant).count();
        int nbrEtudiants2= (int) personnes.stream().filter(e ->e.estEtudiant()).count();
        System.out.println(nbrEtudiants2);
        return nbrEtudiants;
    }
    //En utilisant stream
    public void afficher(){
        System.out.println("=============================");
        System.out.println(description);
        System.out.println("=============================");
        personnes.stream().forEach(x->System.out.println(x));
    }

}
