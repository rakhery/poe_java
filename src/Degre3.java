import java.util.Scanner;

public class Degre3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Entrez a:");
        var a=input.nextInt();


        System.out.println("Entrez b:");
        var b=input.nextInt();


        System.out.println("Entrez c:");
        var c=input.nextInt();
        //System.out.println("a="+a+ " b="+b+ " c="+c );


        System.out.println("Entrez c:");
        var x=input.nextFloat();

        double p=((a+b)/2F)*Math.pow(x,3) + Math.pow((a+b),2)*Math.pow(x,2) + a + b + c;
        System.out.println("La valeur du polynôme est :"+p);

    }
}
