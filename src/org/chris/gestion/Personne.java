package org.chris.gestion;

class Personne {
    private String nom;
    private int annee;
    private String type;

    public Personne(String type,String nom, int annee) {
        this.type=type;
        this.nom = nom;
        this.annee = annee;
    }
    public String getNom() {
        return nom;
    }

    public int getAnnee() {
        return annee;
    }
    boolean estEtudiant(){
        boolean estEtudiant=this instanceof Etudiant;
        return estEtudiant;
    }
    @Override
    public String toString(){

        String out= """
                %s
                Nom: %s
                Annee: %s 
                Etudiant:%b 
                """.formatted(type,nom,annee,estEtudiant());
        return out;
    }



}




