import java.util.Scanner;

public class TP16 {
    public static void main(String[] args) {
        //Ecrire un programme Java demande à l’utilisateur de saisir un text et qui ensuit, retourne la chaine inverse.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer la chaine:");
        String st=scanner.nextLine();
        String inverse="";
        int taille=st.length();
        for(int i=taille-1;i>=0;i--){
            inverse+=st.charAt(i);//accedér une caractère dans la chaine
        }
        System.out.println("Résultat:"+inverse);

    }





}
