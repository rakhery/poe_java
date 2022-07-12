package org.chris.poo;

public class MainTest {
    public static void main(String[] args) {
        double longeur=7;
        double largeur=7;
        Rectangle rectangle=new Rectangle(longeur,largeur);
        String resultat= """
                Perimètre: %.3f
                Aire: %.3f
                """.formatted(rectangle.calculPerimetre(),rectangle.calculAir());
        System.out.println(resultat);



    }
}
