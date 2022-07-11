import java.util.Scanner;

public class FunctionIntro {
    static int somme(int nombre1,int nombre2){
        int resultat=nombre1+nombre2;
        return resultat;
    }
    static String deleteSpecialChars(String chaine){
        String newStr=chaine.replaceAll("[^A-Za-z]","").toLowerCase();
        return newStr;
    }

    static int sumArray(int[] numbersArrays){
        int sum=0;
        for(int number:numbersArrays){
            sum+=number;
        }
        return sum;
    }
    //Pull des litteraux
    static void testString(String chaine1,String chaine2){
            System.out.println("reference: chaine1 ==chaine2 :" + (chaine1==chaine2));
            System.out.println("Valeur:chaine1.equals(chaine2):"+chaine1.equals(chaine2));
    }

    public static void main(String[] args) {
        System.out.println(somme(4,5));
        String a="Jean";
        String b="Jean";//Java pointe vers a automatiquement
        testString(a,b);
        String c=new Scanner(System.in).nextLine();
        //la reference d'avant
        testString(a,c);
        //en itisant
        c=new Scanner(System.in).nextLine();
        c=c.intern();
        testString(a,c);



    }
}
