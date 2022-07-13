package org.chris.poo;

public class Souris {
    private int poids=0;
    private String couleur;
    private int age=0;
    private int esperanceVie;
    private boolean isCloned;
    static final int ESPERANCE_VIE_DEFAUT=36;
    // le poids, la couleur, l’âge et l’espérance de vie.

    public Souris(int poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = ESPERANCE_VIE_DEFAUT;
        System.out.println(" Une nouvelle souris !");
    }

    //un constructeur de copie qui doit afficher le message Clonage d’une souris ! ;
   public Souris(Souris s){
       this.poids = s.poids;
       this.couleur = s.couleur;
       this.age = s.age;
       this.esperanceVie = ESPERANCE_VIE_DEFAUT*4/5;//: les 4 cinquième de celle de la souris d’origine
       this.isCloned=true;
       System.out.println(" Une nouvelle souris clonée !");

   }

    /**
     *
     * une méthode vieillir qui augmentera d’une unité l’âge de la souris.
     * Si la souris est clonée, elle doit devenir verte si elle atteint un âge supérieur à
     * la moitié de son espérance de vie ; même si elle n’est pas appelée explicitement dans la méthode main()
     * , cette méthode doit être publique ; elle sera testée
     */
   public void veillir(){
       if ((isCloned)&&(age>=esperanceVie/2 )){ //refactoring formateur if imbriqué
           couleur="verte";
           }
       else
           age+=1;
   }
   //une méthode évolue faisant vieillir la souris depuis son âge courant jusqu’à son espérance de vie.
    public void evoluer(){
       age=esperanceVie;
    }

   /*
   une méthode toString() produisant une représentation d’une Souris respectant
   strictement le format suivant :
   Une souris <couleur>[, clonée,] de <age> mois et pesant <poids>
   grammes (sur une seule ligne) où <age> est à remplacer par l’âge de la souris
   et <poids> par son poids. Le bout de phrase « , clonée, »
   ne sera affiché que si la souris a été clonée ;
    */

    @Override
    public String toString() {
        String cloned=isCloned?"clonée":"";
        String resultat= """
                Une souris %s,%s de %d mois et pesant %d grammes 
                """.formatted(couleur,cloned,age,poids);
       return resultat;
    }
}
