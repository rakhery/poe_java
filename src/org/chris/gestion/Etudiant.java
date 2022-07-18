package org.chris.gestion;


class Etudiant extends Personne {
    private String section;
    private double moyenne;


    public String getSection() {
        return section;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public Etudiant(String type,String nom,int annee, String section, double moyenne) {
        super(type,nom, annee);
        this.section = section;
        this.moyenne = moyenne;
    }

    @Override
    public String toString(){

        String out= """
                %sSection: %s
                Moyenne: %.3f 
                """.formatted(super.toString(),section,moyenne);
        return out;
    }

}
