import java.util.Scanner;
public class TP15 {
    public static void main(String[] args) {
        /**
         * Ecrire un algorithme qui demande l’utilisateur de créer 2 listes composées de nombres.
         * Ensuite, remplir ces 2 listes à partir de la lecture du clavier tout en sachant que
         * ces 2 listes doivent avoir la même taille(aussi définie par une lecture).
         *
         * Puis, calculer la liste résultante  qui va être construite par la somme des éléments
         * de la première liste et avec l’inverse de la 2ème liste.
         */
        //int[] T1={2 , 4 , 5 , 7 ,8};
        //int[] T2={3 , 7 , 2 , 5 , 6};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer la taille du tableau:");
        int taille=scanner.nextInt();
        //ces 2 listes doivent avoir la même taille(aussi définie par une lecture).

        int[] tab1=new int[taille];
        int[] tab2=new int[taille];
        int[] tab3=new int[taille];

        System.out.println("Saisir Tableau 1");
        for(int i=0;i<tab1.length;i++){
            System.out.printf("Tab1[%d]=",i);
            tab1[i]=scanner.nextInt();
        }
        System.out.println("Saisir Tableau 2");
        for(int i=0;i<tab1.length;i++){
            System.out.printf("Tab2[%d]=",i);
            tab2[i]=scanner.nextInt();
        }
        System.out.print("Tab3=[");
        for(int i=0;i<tab3.length;i++){
            tab3[i]=tab1[i]+tab2[taille-i-1];
            System.out.print(tab3[i]+ ",");
        }
        System.out.println("]");



    }
}
