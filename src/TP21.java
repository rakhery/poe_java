public class TP21 {
    static String trouver(int[][] tab2D,int key ){
      int nbrOccur=0;
      int longeur=tab2D.length;
      int largeur=tab2D[0].length;
      StringBuilder chaine=new StringBuilder();
      for(int i=0;i<longeur;i++){
          for(int j=0;j<largeur;j++){
              if(key==tab2D[i][j]) {
                  nbrOccur += 1;
                  chaine.append("(" + i + "," + j + ")");
              }

          }
      }
      String resultat= """
              %s se retrouve %d fois dans 
              les emplacements suivants %s
              """.formatted(key,nbrOccur,chaine);
      return resultat;
    }

    public static void main(String[] args) {
        //initilaisation du tableau
        int[][] tab={ {1, 4, 2, 1},{6, 3, 8, 9},{1, 5, 1, 0}};
        System.out.println(trouver(tab,1));

    }
}
