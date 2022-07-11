import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TP19 {
    public static void main(String[] args) {
        //Intilialiser le tableau des emails
        String[] emails={
                "christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"
        };
        int taille=emails.length;
        float gmail=0;
        float yahoo=0;
        float hotmail=0;
        //entretien Approche Algo obligatoire

        for(String st:emails){
            //Séparer en deux tableau avec @
            //Alternatif avec la methode contains
            String[] st1=st.split("@");// attention index 0 et 1
            //System.out.println("st1"+ Arrays.toString(st1));
            if (st1[1].equals("gmail.com")){
                gmail+=1;
            }else if(st1[1].equals("yahoo.fr")){
                yahoo+=1;
            }else{
                hotmail+=1;
            }
        }
        //Afficher le resultat
        System.out.println(" le taux d’adresse gmail="+(gmail/taille)*100 +"%");
        System.out.println(" le taux d’adresse yahoo="+(yahoo/taille)*100 +"%");
        System.out.println(" le taux d’adresse hotmail="+(hotmail/taille)*100 +"%");

        //Methode 2
        // Convertir Arrays to stream (flux) avec Supplier
        Supplier<Stream<String>> courriels=()->Arrays.stream(emails);
        gmail=courriels.get().filter(s -> s.contains("@gmail.com")).count();
        yahoo=courriels.get().filter(s -> s.contains("@yahoo.fr")).count();
        hotmail=courriels.get().filter(s -> s.contains("@hotmail.fr")).count();
        //Afficher le resultat
        String affichage= """
                Rapport:
                Le taux d’adresse gmail=%.2f %%
                le taux d’adresse yahoo=%.2f %%
                le taux d’adresse hotmail=%.2f %% 
                """.formatted((gmail/taille)*100,(yahoo/taille)*100,(hotmail/taille)*100);
        System.out.println(affichage);





    }
}
