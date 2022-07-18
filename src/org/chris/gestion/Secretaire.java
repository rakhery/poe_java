package org.chris.gestion;

import java.util.Date;
/*
 @commentaire:Formateur
 Le secrétaire peut evoluer dans les exigences(requirments)
 si Le rôle peut faire la distinct° , une caratère +

 */
class Secretaire extends Personnel{
    //String nom,int date,String laboratoire,int salaire
    public Secretaire(String type,String nom, int date,String laboratoire,int salaire) {
        super(type,nom,date,laboratoire,salaire);

    }

}
