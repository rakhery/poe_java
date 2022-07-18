package org.chris.agentVoyage;


// Le prix du transport vaut la constante TARIF_LONG (1500.0)
// si le trajet est long et TARIF_BASE (200.0) sinon, auquel on ajoutera le prix forfaitaire de l’option.
class Transport extends OptionVoyage{
    //Par défaut, un Transport a un trajet court.
    private boolean estLoin=false;
    static final double TARIF_BASE=200.0;
    static final double TARIF_LONG=1500.0;
    private double prixTransport;

    public Transport(String nom, double prix,boolean estLoin) {
        super(nom, prix);
        this.estLoin=estLoin;
    }
    public double getPrixTransport(){
        if(estLoin)
            return TARIF_LONG;
        else
            return TARIF_BASE;

    }

    public double prix() {
        return getPrixTransport()+super.prix();
    }
    @Override
    public String toString() {
        String out= """
              %s -> %.2f €.
               """.formatted(getNom(),prix());
        return out;
    }
}
