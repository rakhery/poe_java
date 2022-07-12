public class TP23 {
    static int sommeDiagonale(int[][] tab2D){
        int somme1=0;
        int somme2=0;
        int longeur=tab2D.length;

        //int[][] position={{0,0}};
        for(int i=0;i<longeur;i++){
                somme1+=tab2D[i][i];
        }
        for(int i=0;i<longeur;i++){
            somme2+=tab2D[i][longeur-i-1];
        }
        return somme2+somme1;
    }

    public static void main(String[] args) {
        int[][] tab={ {1, 1, 1},{1, 1, 1},{1, 1, 1}};
        System.out.println(sommeDiagonale(tab));

    }
}
