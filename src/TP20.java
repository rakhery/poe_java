import java.util.Arrays;
import java.util.Scanner;

public class TP20 {

    static String saisir(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String s1 = scanner.nextLine();
        //Attention aux caractères pour le registre d' expression
        String st1=s1.replaceAll("[^A-Za-z]","").toLowerCase();
        return st1;
    }
    static boolean estPrefix(String chaine1,String prefix){
        boolean estPrefixe=false;
        char[] tab1= chaine1.toCharArray();
        char[] tab2=prefix.toCharArray();
        int j=0;
        while(j<prefix.length()){
            if(tab1[j]!=tab2[j]){
                estPrefixe=false;
                break;
            }
            j+=1;
        }
        if (j==prefix.length())
            estPrefixe=true;
        return estPrefixe;

    }



    public static void main(String[] args) {
        /*
        isPrefix(“banner”, “bang”)
        falseisPrefix(“hugging”, “hug”)
         */
        String chaine =saisir("chaine 1:");
        String suffix=saisir("suffix:");
        System.out.println( estPrefix(chaine, suffix));


    }
}
