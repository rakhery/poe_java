import java.util.Scanner;

public class TP13 {
    public static void main(String[] args) {

        /**

        Ecrire un programme Java qui permet à l’utilisateur de déclarer 3 array d’entiers.
         Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN]
         et la somme de tous les éléments multiples 3 dans les 3 tableaux.
        **/
         //int[] T1={ 2, 6, 8, 15,39,11};
         //int[] T2={21, 33, 12, 19,0};
        // int[] T3={17, 18, 46};

        //créer l'instance de scanner
        Scanner scanner=new Scanner(System.in);
        //Saisir T1
        System.out.println("Entrer la taille de T1:");
        int taille1=scanner.nextInt();
        int[] T1=new int[taille1];
        System.out.println("Saisir Tableau 1");
        for(int i=0;i<T1.length;i++){
            System.out.printf("T1[%d]=",i);
            T1[i]=scanner.nextInt();
        }
        //Saisir T2

        System.out.println("Entrer la taille de T2:");
        int taille2=scanner.nextInt();
        int[] T2=new int[taille1];
        System.out.println("Saisir Tableau 1");
        for(int i=0;i<T1.length;i++){
            System.out.printf("T2[%d]=",i);
            T2[i]=scanner.nextInt();
        }
        //Saisir T3

        System.out.println("Entrer la taille de T2:");
        int taille3=scanner.nextInt();
        int[] T3=new int[taille1];
        System.out.println("Saisir Tableau 1");
        for(int i=0;i<T1.length;i++){
            System.out.printf("T3[%d]=",i);
            T2[i]=scanner.nextInt();
        }
        int[] T=new int[taille1+taille2+taille3];
        //Afficher les 3 tableaux en format [element1, element2,...,elementN]

        int somme=0;

         //Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN]


        System.out.print("S=");
         for (int i=0;i<T1.length;i++){
             int v=0;
             if(T1[i] %3==0) {
                 v=T1[i];
                 somme += T1[i];
                 System.out.print(v+ "+");
             }
         }
        System.out.println("="+somme);

    }
}
