package org.chris.poo;

public class Personne {
    private String nom;
    private String prenom;
    private int nbrEnfant;
    private boolean isMarried;

    public Personne(String nom, String prenom, int nbrEnfant, boolean estMarried) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbrEnfant = nbrEnfant;
        this.isMarried = estMarried;
    }

    public Personne() {
    }

    public String getNom() {
        return nom;
    }

    /**
     * Getter et Setterdependent des exigences des besoins métiers
     * @commentaire Formateur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean estMarried) {
        this.isMarried = estMarried;
    }

    public void afficher(){
        String married="";
        if(isMarried)
            married="Marié(e)";
        else
            married="Célibataire";

        String affichage= """
                Nom:%s Prénom:%s
                %s 
                %d enfants
                """.formatted(nom,prenom,married,nbrEnfant);
        System.out.println(affichage);
    }


}
