import java.util.HashMap;
import java.util.Scanner;

/**@author: Bejamin Perrin
 *
 */
public class TP18BejamainPerrin {
    static HashMap<Character, Integer> createCharMapping(String word) {
        String phraseWord = word.replaceAll("[^A-Za-z]", "").toLowerCase();
        HashMap<Character, Integer> occurences = new HashMap<>();

        for (int index = 0; index < phraseWord.length(); index++) {
            char lettre = phraseWord.charAt(index);
            if (occurences.containsKey(lettre)) {
                int ancienneValeur = occurences.get(lettre);
                occurences.replace(lettre, ancienneValeur + 1);
            } else {
                occurences.put(lettre, 1);
            }

        }
        return occurences;
    }
    static Boolean isAnagramme(String word, String word2) {
        return createCharMapping(word).equals(createCharMapping(word2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez entrer un mot : ");
        String word = input.nextLine();
        System.out.print("Veuillez entrer second mot : ");
        String word2 = input.nextLine();

        Boolean result = isAnagramme(word, word2);
        if (result) {
            System.out.println(word + " est un anagramme de " + word2);
        } else {
            System.out.println(word + " n'est pas un anagramme de " + word2);
        }


    }

}
