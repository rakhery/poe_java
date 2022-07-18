package org.chris.gestion;

import java.util.ArrayList;

public class Gestion {
    private String nom;
    private ArrayList<Personne> personnes;

    public Gestion(String nom) {
        this.nom=nom;
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
    public int getNombreEtudiant(){
        int nbretudiants= (int) personnes.stream().filter(e ->e instanceof Etudiant).count();
        return nbretudiants;
    }
    public void afficher(){
        personnes.stream().forEach(x->System.out.println(x.toString()));
    }

}
