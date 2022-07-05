public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world M2i TOURS St Avertin");
        int longueur=200;
//        longueur=20;
//        longueur=35;

        int largeur=50;
//        largeur=20;
//        largeur=10;
        //JDK 18 keyword var


        int perimetre=2*(longueur+largeur);
        int surface=longueur*largeur;
        System.out.println(perimetre);
        System.out.println(surface);

         // l'usage du mot clé var JDK 10
        //var javascript, C#,....ne peut être utilisé que sur les variables locales
        var hauteur=12;
        // var n'est pas keyword java
        var var=10;

        //Les variables
        //        Chaine de caractères
        String prenom="Christian";

        //JDK 15 Texte Blocks
        String textBlock1="""
                Ligne 1
                Ligne 2
                    Ligne 3
                
        """;
        System.out.println(textBlock1);
        //JDK 15 la methode  formatted
        String textBlock2= """
                nom: %s
                prenom: %s
                email: %s
                """.formatted("RAK","Christian","monEmail@gmail.com");
        System.out.println(textBlock2);


        String nom="Lisangola";

//        Caractère
        char genre='m';

//        Réels
//        Poids : 85.32746832643467322
//        Prix : 45.78698976869
        float poids=85.5F;
        float tjm=8.4F;

//        Réel double précision
        double v=45.3;

//        Byte : une variante d'entier court
        byte age=89;


    }
}
