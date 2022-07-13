package org.chris.gestion;
import java.util.ArrayList;


public class TP5Test {
    public static void main(String[] args){
        System.out.println("Gestion du personnel");
        ArrayList<Personne> toutLeMonde=new ArrayList<>();
        toutLeMonde.add(new Secretaire("Secrétaire","Christiane Lisangolanne",2005,"Chimie",5000));
        toutLeMonde.add(new Etudiant("Etudiant regulier","Chris Lisangola",2013,"Physique",15));
        toutLeMonde.add(new Etudiant("Etudiant regulier","Jihane Cheddadi",2011,"Math informatique",15));
        toutLeMonde.add(new EtudiantEchange("Etudiant d'echange","Paris 40","Bjorn cote de fer",2012,"Physique"));
        toutLeMonde.add(new Enseignant("Enseignant","Zinedine Benzema",1998,"Physique",2000,"Physique"));
        //affichage du nombre de personnes qui fréquentent CLBIT
        //dont le nombre d'étudiants.

        int nbretudiants= (int) toutLeMonde.stream().filter(e ->e instanceof Etudiant).count();
        System.out.println("Nbr="+nbretudiants);
        System.out.println("=====================");

        /*Affichage des informations stockées sur chaque personne
        vous définirez une méthode estEtudiant retournant true pour les étudiants et false pour tous les autre*/
        toutLeMonde.stream().forEach(x->System.out.println(x.toString()));

    }
}
