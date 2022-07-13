package org.chris.gestion;



public class Personnel extends Personne {
    private int salaire;
    private String laboratoire;


    public Personnel(String type,String nom,int date,String laboratoire,int salaire) {
        super(type,nom,date);
        this.salaire=salaire;
        this.laboratoire=laboratoire;

    }
    @Override
    public String toString(){

        String out= """
                %sSalaire: %d 
                Laboratoire: %s
                """.formatted(super.toString(),salaire,laboratoire);
        return out;
    }

}
