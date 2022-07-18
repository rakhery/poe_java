import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordAlgo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Fixer le nombre de caractères à 4
//        Demander à l'utilisateur de reessayer tant que le code PIN ne contient pas
//        exactement 4 chiffres
//        Définition du code PIN

        boolean estCodeValide=false;
        int codePIN;
        while(!estCodeValide){
            System.out.print("Veuillez définir un code PIN : ");
            String codePINSt=input.nextLine();
            //  Expression régulière
            Matcher matcher= Pattern.compile("\\d{4}").matcher(codePINSt);
            if(matcher.matches()){
                estCodeValide=true;
                codePIN =Integer.parseInt(codePINSt);
                System.out.println("CODE OK!");
                break;
            }
            System.out.println("le code PIN  doit contenir exactement 4 chiffres. SVP");
        }


        //Requirement digit Pin
        int codePIN2=input.nextInt();
        int longeur=(int) (Math.log10(codePIN2)+1);
        System.out.println("longeur="+longeur);

        // Brute
        int longeur2=0;
        int  temp=1;
        while(temp<=codePIN2){
            longeur2++;
            temp*=10;
        }
        System.out.println("longeur2="+longeur2);




//        Essayer de deverouiller le téléphone avec un code PIN
        int codePINATester;
        int compteur=0;
//        Limiter le nombre de tentatives à 3.Mais ne pas utiliser une boucle for
        while (true && compteur<=2 ){
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " + ": ");
            codePINATester=input.nextInt();//1234
            if(codePINATester==1234){
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }
            System.out.println("Code PIN Erroné.Veuillez reessayer");
            compteur++;
            System.out.println("Nbr tentative:"+compteur);
        }

    }
}
