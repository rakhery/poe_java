package org.chris.agentVoyage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class KitVoyage {
    private List<OptionVoyage> voyages=new ArrayList<OptionVoyage>();
    private final String depart;
    private final String arrive;
    //d’un constructeur compatible avec le main
    KitVoyage(String depart,String arrive){
        this.voyages=new ArrayList<>();
        this.depart=depart;
        this.arrive=arrive;
    }


    //d’une méthode double prix() qui calculera le prix du kit comme la somme du prix de toutes ses options ;
    public double prix(){
        var somme = voyages.stream().mapToDouble(v -> v.prix()).sum();
        return somme;
    }
    //d’une méthode toString, générant une représentation du kit sous la forme d’une String, selon
    // le format suivant : Voyage de <depart> à <destination>, avec pour options :
    //
    //- <nom option1> -> <prix option1> €
    //....
    //<nom optionN> -> <prix optionN> €

    @Override
    public String toString() {
        String trajet= """
               Voyage de %s à %s, avec pour options :
               """.formatted(depart,arrive);
        String option= "%s".formatted(voyages.stream().map(OptionVoyage::toString)
                .collect(Collectors.joining("")));
        String prixtotal="Prix total : %.1f €".formatted(prix());
       return trajet+option+prixtotal;
    }

        //une méthode ajouterOption, compatible avec
    // le main fourni et permettant d’ajouter une OptionVoyage à la collection d’options du kit
    public void ajouterOption(OptionVoyage option) {
        voyages.add(option);
    }
    //une méthode annuler vidant la collection d’options (utiliser la méthode clear des ArrayList) ;
    public void annuler(){
        voyages.clear();
    }
    //une méthode getNbOptions retournant le nombre d’options de voyage du kit.
    public int getNbOptions(){
        var  nbOptions= (int) voyages.stream().count();
        return nbOptions;
    }



}
