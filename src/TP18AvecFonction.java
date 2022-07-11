import java.util.Arrays;

import java.util.Scanner;


public class TP18AvecFonction {

    static String saisir(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String s1 = scanner.nextLine();
        //Attention aux caractères pour le registre d' expression
        String st1=s1.replaceAll("[^A-Za-z]","").toLowerCase();
        return st1;
    }
    static char[] convertirTabCharacter(String chaine){
        char tab1[] = chaine.toCharArray();
        return tab1;
    }
    static boolean isAnagramme(char[] tab1,char[] tab2 ) {
        Arrays.sort(tab1);
        Arrays.sort(tab2);
       return Arrays.equals(tab1,tab2);

    }


    public static void main(String[] args) {
        String chaine1= saisir("Entrer la chaine 1:");
        String chaine2= saisir("Entrer la chaine 2:");
        char[] tb1=convertirTabCharacter(chaine1);
        char[] tb2=convertirTabCharacter(chaine2);
        System.out.println(Arrays.toString(tb1)+ " " + Arrays.toString(tb2));
        if(isAnagramme(tb1,tb2))
            System.out.println("la chaine:" +chaine1 + " est" + " Anagramme de " + chaine2);
        else
            System.out.println("la chaine:" +chaine1 + " n\'est pas" + " Anagramme de " + chaine2);



    }
}
