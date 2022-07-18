package org.chris.agentVoyage;

class Sejour extends OptionVoyage{
    private int nbrNuits;
    private double prixUnitaire;

    //Les arguments pour le constructeur de Sejour sont dans l’ordre : le nom, le prix forfaitaire,
    // le nombre de nuits et le prix par nuit. Par défaut, un Transport a un trajet court.
    public Sejour(String nom,double prixForfaitaire,int nbrNuits,double prixUnitaire) {
        super(nom,prixForfaitaire);
        this.nbrNuits=nbrNuits;
        this.prixUnitaire=prixUnitaire;

    }

    public double prix() {
        return nbrNuits*prixUnitaire+super.prix();
    }
    // <nom optionN> -> <prix optionN> €
    @Override
    public String toString() {
            String out= """
             %s -> %.2f €.
               """.formatted(getNom(),prix());
            return out;

    }
}
