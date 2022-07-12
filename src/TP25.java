import java.util.Scanner;
import java.util.regex.Pattern;

public class TP25 {
    /**
     * Pseudo : (min : 5,max : 10)
     * Nom :(min : 4, max : 30)
     * Prénom : (min : 2, max : 30)
     * Mot de passe : (min : 8, max : 50)
     * Email valide
     **/

    static final public int PSEUDO_MIN = 5;
    static final public int PSEUDO_MAX = 10;
    static final public int NOM_MIN = 4;
    static final public int NOM_MAX = 30;
    static final public int PRENOM_MIN = 4;
    static final public int PRENOM_MAX = 30;
    static final public int PASS_MIN = 4;
    static final public int PASS_MAX = 30;

    //Afficher un message au utilisateurs
    static void message(String message){
        System.out.println(message);
    }
    //Sasir les données du clavier
    static String saisir(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String s1 = scanner.nextLine();
        return s1;
    }

    //Verifier si le format de l'email est valide
    static boolean isValidEmail(String email) {
        boolean isValidEmail = true;
        String emailReg = "^(.+)@(\\S+)$";
        if(!email.matches(emailReg)){
            message("le format email doit être valide");
            isValidEmail=false;

        }
        return isValidEmail;
    }

    static boolean isValidPrenom(String prenom) {
        boolean isValidPrenom = false;
        int taille = prenom.length();
        if (!((taille > PRENOM_MIN) || taille < PRENOM_MAX)) {
            isValidPrenom = true;
            message("Le Prénom doit etre: [min : 2, max : 30]");
        }
        return isValidPrenom;
    }

    static boolean isValidNom(String nom) {
        boolean isValidNom = true;
        int taille = nom.length();
        if (!((taille > NOM_MIN) || taille < NOM_MAX)){
            isValidNom = true;
            message("Le Nom  doit etre: (Min : 4, max : 30)");
        }
        return isValidNom;
    }

    static boolean isValidPseudo(String pseudo) {
        boolean isValidPseudo = true;
        int taille = pseudo.length();
        if (!((taille > PSEUDO_MIN) || taille < PSEUDO_MAX)){
            isValidPseudo=false;
            message("Le Pseudo  doit etre: [Min : 4, max : 30]");
        }
        return isValidPseudo;
    }
    static boolean isValidPass(String pass) {
        boolean isValidPass = false;
        int taille = pass.length();
        if (!((taille > PASS_MIN) || taille < PASS_MAX)) {
            isValidPass = false;
            message("Mot de passe doit être : (min : 8, max : 50)");
        }
        return isValidPass;
    }


    public static void main(String[] args) {

        String pseudo = saisir("Saisir le Pseudo:");
        if (isValidPseudo(pseudo))
            message("Pseudo OK!");

        String nom = saisir("Nom:");
        if (isValidNom(nom))
            message("Nom OK!");

        String prenom = saisir("Saisir le Prénom:");
        if (isValidPrenom(prenom))
            message("Prénom Ok!");

        String pass = saisir("Saisir le mot de passe:");
        if (isValidPass(pass))
            message("Mod de passe OK!");

        String email = saisir("Saisir l' Email:");
        if (isValidEmail(email))
            System.out.println("Email OK!");

        //Recolter les données
        String donnees = """
                Pseudo:%s
                Nom: %s
                Prénom: %s
                Mot de passe:%s
                Email: %s
                """.formatted(pseudo, nom, prenom, email);

        message("Authentification reussie!");
        System.out.println(donnees);
    }

}
