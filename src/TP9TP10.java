import java.util.Scanner;

public class TP9TP10 {

    public static void main(String[] args) {
        // Données à l'interieur du programme
        String email="test@gmail.com";
        String motDePasse="1234";


        boolean estAuthentifie=false;
        int compteur=0;

        //Les exigences  saisir des mauvais identifiants est limité à 5
        while (!estAuthentifie && compteur<5){
            //Saisir le login
            System.out.println("Login:");
            String login=new Scanner(System.in).nextLine();
            //Saisir le mot de passe
            System.out.println("Pass:");
            String pass=new Scanner(System.in).nextLine();

            //Tester le login + mot de passe
            if(login.equals(email) && pass.equals(motDePasse)){
                estAuthentifie=true;
                System.out.println("Bienvenu dans votre espace client");
                boolean isDeconnecte=false;

                //Deconnect° espace privé
                while (!isDeconnecte){
                    System.out.print("#(d)econnecter espace client "+ "# (i)nfos personnel # (v) virement BTC \n");
                    String d=new Scanner(System.in).nextLine();
                    if(d.equals("d")){
                        isDeconnecte=true;
                    }
                    if(d.equals("i")){
                        System.out.println("email:"+email);
                        System.out.println("pass:"+motDePasse);
                    }
                    if(d.equals("v")){
                        for(int i=0; i<=5; i++)
                            System.out.printf("%d  virement de XXX a YYY \n",i);
                    }

                };
                break;
            }
            compteur++;
            System.out.println("Identifiants incorrect..."+ "Nbr de tentative:"+compteur);
        }
        System.out.println("Espace public ");


    }
}
