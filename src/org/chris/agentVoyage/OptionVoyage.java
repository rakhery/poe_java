package org.chris.agentVoyage;

class OptionVoyage {
    private String nom;
    private double prixForfaitaire;
    //un constructeur initialisant les attributs au moyen de valeurs passées en
    // paramètre et dans un ordre compatible avec le main fourni ;
    public OptionVoyage(String nom, double prix) {
        this.nom = nom;
        this.prixForfaitaire = prix;
    }
    //une méthode getNom retournant le nom de l’option ;
    public String getNom() {
        return nom;
    }
    //une méthode double prix() retournant le prix forfaitaire de l’option ;

    public double prix(){
        return prixForfaitaire;
    }

    //une méthode toString produisant une représentation de l’option sous la forme d’une chaîne de caractères, selon le format suivant :
    // <nom> -> <prix> € où <nom> est le nom de l’option et <prix> est son prix.

    @Override
    public String toString() {
       String out= """
               %s -> %f € 
               """.formatted(getNom(),prix());
       return out;
    }
}
