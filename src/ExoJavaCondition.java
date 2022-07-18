import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class ExoJavaCondition {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Test de nombre 1");
        System.out.print("Entrer le nombre:");
        //Initialisation de nombre
        int nombre=input.nextInt();
        //Verifier si le nombre est paire
        if (nombre>0)
            System.out.println("le nombre est positif");
        if (nombre<0)
            System.out.println("le nombre est negatif");
        if (nombre%2==0){
            //verifier si le nbr est paire
            System.out.println("Le nbr est paire");
        }
        else {
            //Sinon le nbr est impaire
            System.out.println("Le nombre est impaire");
        }


        System.out.println("Resolution equat° de la forme ax^2+bx+c = 0");
        System.out.print("Entrer le coeff a:");
        float a=input.nextFloat();
        System.out.print("Entrer le coeff b:");
        float b=input.nextFloat();
        System.out.print("Entrer le coeff c:");
        float c=input.nextFloat();
        //Calcul de delta
        float delta=b*b-4*a*c;

        // La solut° en fonction du delta
        if (delta<0)
            System.out.println("Pas de solution...");
        if (delta==0)
            System.out.println("La solution est x="+ (-b)/(2f*a));
        if (delta>0) {
            System.out.println("2 solut° x1=" + (-b + Math.sqrt(delta)) / (2f * a));
            System.out.println("2 solut° x2=" + (-b - Math.sqrt(delta)) / (2f * a));
        }

        System.out.println("Trouver le mois ");
        System.out.print("Entrer le nombre de mois:");
        int mois=input.nextInt();
        if(mois<=0 || mois>12) {
            System.out.println("Votre nbr mois ?");
        }
        else{

        }
            System.out.println(Month.of(mois).getDisplayName(TextStyle.FULL,new Locale("fr")));



    }





    class Fraction{
        private int numerateur;
        private int denominateur;
        public Fraction(int num,int dem){
            numerateur=num;
            denominateur=dem;

        }
        public int getDenominateur(){
            return denominateur;
        }
        public int getNumerateur(){
            return denominateur;
        }






    }

}
