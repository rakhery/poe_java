import java.util.Arrays;
import java.util.Scanner;

public class TP14 {
    public static void main(String[] args) {
        /**
         * Écrire un programme Java qui demande à l’utilisateur de remplir un
         * tableau d’entiers à partir du clavier.
         * Puis le programme devra lui demander d’entrer un nombre à rechercher dans le tableau.
         * Si nombre existe, le programme lui dira que le nombre existe et
         * le nombre de fois qu’ils se retrouve dans le tableau
         * Sinon le programme lui dira que le nombre recherché
         * n’existe pas dans le tableau
         */

        Scanner scanner=new Scanner(System.in);


        System.out.println("Taille du tableau:");
        int taille=scanner.nextInt();
        int[]tab=new int[taille];
        System.out.println("Saisir la valeur du tableau");
        for(int i=0;i<tab.length;i++){
            System.out.printf("Tab[%d]=", i);
            tab[i]=scanner.nextInt();
        }
        //Verification du tableau
        System.out.println(Arrays.toString(tab));
        System.out.println("Trouver une valeur dans le tableau v:");
        int key=scanner.nextInt();
        int nfois=0;
        //pas d'ecriture
        for(int i:tab){
            if (i==key){
                nfois++;
                System.out.println("le nombre existe "+nfois+" fois");
            }

        }
        System.out.println("Le nbr n'existe pas dans le tableau");



    }
}
