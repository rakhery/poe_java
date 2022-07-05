import java.util.Scanner;

public class KeyBoardInput {

    // 1.Demander à l'utilisateur:nom,prenom, age, poids
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // 1.Demander à l'utilisateur:nom,prenom, age, poids
        System.out.print("Votre nom:");
        var nom=input.nextLine();
        System.out.print("Votre prenom:");
        var prenom=input.nextLine();
        System.out.print("Votre age:");
        var age=input.nextByte();
        System.out.print("Votre Poids:");
        var poids=input.nextFloat();
        var affichage= """
                Nom: %s
                Prenom: %s
                Age: %d
                Poids: %.2f
                """.formatted(nom,prenom,age,poids);
        System.out.println(affichage);

    }

}
