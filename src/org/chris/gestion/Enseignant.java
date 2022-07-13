package org.chris.gestion;
public class Enseignant extends Personnel{
    private String section;
    //String nom,int date,String laboratoire,int salaire
    public Enseignant(String type,String nom, int date, String laboratoire, int salaire,String section) {
        super(type,nom,date,laboratoire,salaire);
        this.section=section;

    }
    @Override
    public String toString(){

        String out= """
                %sSection: %s 
                """.formatted(super.toString(),section);
        return out;
    }

}
