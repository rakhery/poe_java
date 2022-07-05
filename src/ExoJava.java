import java.util.Scanner;

public class ExoJava {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrer le diametre:");
        float diametre=input.nextFloat();
        float rayon=diametre/2;
        double surface=Math.pow(rayon,2)*Math.PI;
        System.out.println("La surface"+surface);
        System.out.println("Entrez a:");
        var a_input=input.nextInt();
        var b=a_input;
        System.out.println("Entrez a:");
        var b_input=input.nextInt();
        var c=b_input;
        var c_input=input.nextInt();
        var a=c_input;
        System.out.print("a="+a+ " b="+b+ " c="+c );


    }


}
