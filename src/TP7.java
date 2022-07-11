import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Trouver le mois ");
        System.out.print("Entrer le nombre de mois:");
        int mois=input.nextInt();
        //Nouveau switch
        String moisSt=switch(mois){
            case 1-> "Janvier";
            case 2->"Fevrier";
            case 3->"Mars";
            case 4->"Avril";
            case 5->"Mai";
            case 6->"Juin";
            case 7->"Juillet";
            case 8->"Aout";
            case 9->"Septembre";
            case 10->"Octobre";
            case 11->"Novembre";
            case 12->"Decembre";
            default -> throw new IllegalStateException("Unexpected value: " + mois);
        };
        System.out.println(moisSt);

    }
}
