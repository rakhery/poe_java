package org.chris.poo;

/**
 * Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur « Indice de Masse Corporelle» (IMC).
 *
 *     crée un patient,
 *     affiche les données du patient ainsi que son IMC.
 *     Avoir la possibilité de connaître la taille du patient, son poids
 */
public class Patient {

    private double poids;
    private double taille;

    private double imc;
    public Patient(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
        this.imc=calculIMC();

    }
    //calculer leur « Indice de Masse Corporelle» (IMC)
    public double calculIMC() {
        imc=poids/Math.pow(taille,2);
        return imc;
    }
    //test Amelioration switch java sans break
    public String analyserIMC(){

        String resultat=switch ((int)imc){
            case 10,11,12,13,14,15,16,17,18->"Insuffisance pondérale (maigreur)";
            case 19,20,21,22,23,24,25->" Corpulence normale";
            case 26,27,28,29,30->"Surpoids";
            case 31,32,33,34,35->"Obésité modérée";
            case 36,37,38,39,40->"Obésité sévère";
            default -> "Obesité morbide ou massive";
        };
        return resultat;
    }



    @Override
    public String toString() {
        String out= """
                Patient 
                Poids: %.2f kg taille %.2f m 
                IMC: %.2f
                Interprétation du docteur Java:
                %s
                 
                """.formatted(poids,taille,imc,analyserIMC());
      return out;
    }
}
