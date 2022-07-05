import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Entrer Age:");
        byte age=input.nextByte();
        //Effectue le calcul de l’année de naissance de l’utilisateur et l’enregistre dans la variable annee de type entier ;int
        //Methode 1
        Date date=new Date();
        int anniv=date.getYear()-age;
        int annee=anniv+1900;
        System.out.println("Date de naissance:"+annee);
        //Methode 2
        int anniv2 = Calendar.getInstance().get(Calendar.YEAR);
        int annee2=anniv2-age;
        System.out.println("Date de naissance:"+annee2);
        //Methode3
        int anniv3 = YearMonth.now().getYear();
        int annee3=anniv3-age;
        System.out.println("Date de naissance:"+annee3);

    }
}
