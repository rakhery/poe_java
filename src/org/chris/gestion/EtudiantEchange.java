package org.chris.gestion;

public class EtudiantEchange extends Etudiant {
    private String origineUniv;


    public String getOrigineUniv() {
        return origineUniv;
    }

    public void setOrigineUniv(String origineUniv) {
        this.origineUniv = origineUniv;
    }

    public EtudiantEchange(String type,String origineUniv,String nom,int annee, String section) {
        super(type,nom,annee,section,0);
        this.origineUniv = origineUniv;

    }
    @Override
    public String toString(){

        String out= """
                %sSection: %s
                """.formatted(super.toString(),origineUniv);
        return out;
    }
}
