import java.util.Scanner;

public class TP17 {
    public static void main(String[] args) {
        //Ecrire un programme Java demande à l’utilisateur de saisir un nombre, et qui ensuite affiche le nombre inverse.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nbr:");
        int nbr = scanner.nextInt();
        int invNbr = 0;
        if (nbr >= 0) {

            while (nbr > 0) {
                invNbr = invNbr * 10 + nbr % 10;
                nbr = nbr / 10;
            }
            System.out.println("Résultat :" + invNbr);

        } else {
            //forcer +
            nbr=Math.abs(nbr);
            while (nbr > 0) {
                invNbr = invNbr * 10 + nbr % 10;
                nbr = nbr / 10;
                System.out.println("Résultat :-" + invNbr);

            }

        }
    }
}

