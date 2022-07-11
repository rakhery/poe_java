import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TP18 {
    public static void main(String[] args) {
        /**Ecrire un programme Java demande à l’utilisateur de saisir 2 chaines de caractères et qui ensuite renseigne si ce sont des anagrammes.
         Mot formé en changeant de place les lettres d'un autre mot
         **/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer la chaine 1:");
        String s1 = scanner.nextLine();
        //Nettoyage espace
        String st1=s1.replaceAll("\\s","");

        System.out.println("Entrer la chaine 2:");
        String s2 = scanner.nextLine();
        String st2=s2.replaceAll("\\s","");

        // classifier dans l'ordre alphabetique dans un tableau
        char tab1[] = st1.toCharArray();
        Arrays.sort(tab1);
        char tab2[] = st2.toCharArray();
        Arrays.sort(tab2);

        //Algo
        //Verifier si les 2 tableaux ont de la meme taille
        int taille=tab1.length;

        boolean memeTaille=(taille== tab2.length);
        int i=0;

        while(memeTaille==true && i>taille){
            if (tab1[i]!=tab2[i])
                memeTaille=false;
            i++;
        }

        if(memeTaille==true)
            System.out.println("la chaine:" + s1 + " est" + " Anagramme de " + s2);
        else
            System.out.println("la chaine:" + s1 + " n\'est pas" + " Anagramme de " + s2);

         //2 methode Stream langage

        if (st1.length()==st2.length()){
            String stTrie1 =st1.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
            String stTrie2 =st2.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
            boolean estAnagramme=stTrie2.equals(stTrie1);
            if(estAnagramme)
                System.out.println("la chaine:" + s1 + " est" + " Anagramme de " + s2);
            else
                System.out.println("la chaine:" + s1 + " n\'est pas" + " Anagramme de " + s2);
            }
        }





    }

