import java.util.HashMap;
import java.util.Map;

public class TP22 {

    static boolean estIdentique1(String chaine1) {
        boolean estIdentique = false;
        for (int i = 0; i < chaine1.length(); i++) {
            if (i != 0 && chaine1.charAt(i) == chaine1.charAt(i - 1)) {
                estIdentique = true;
            }
        }
        return estIdentique;

    }
    //avec Map
    static boolean estIdentique2(String chaine1) {
        boolean estIdentique = false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < chaine1.length(); i++) {
            if (map.containsKey(chaine1.charAt(i))) {
                map.put(chaine1.charAt(i), map.get(chaine1.charAt(i)) + 1);
            } else {
                map.put(chaine1.charAt(i), 1);
            }
        }

        for (int i = 0; i < chaine1.length(); i++) {
            if (map.get(chaine1.charAt(i)) != 0) {
                estIdentique = true;
            }

        }
        return estIdentique;
    }

    public static void main(String[] args) {
        System.out.println(estIdentique1("terrific"));
        System.out.println(estIdentique2("terrific"));
        //System.out.println(estIdentique("chats"));
    }
}
