public class AlgoJava {



    public static void main(String[] args) {
    /*@title: Saisir des données et afficher
   *@description: inverser string
   @date
   * @author Christian
  */
     inverserChaineBoucle("Ceci est un texte");

    }

    /**@title: Inverser une chaine
     * @description: inverser une Boucle
     * @param st
     * @return st
     * @Author: Christian RAKOTO
     *
     */
    public static String inverserChaineBoucle(String st) {
        String inverse="";
        for(int i=st.length()-1;i>=0;i--){
            inverse+=st.charAt(i);//accedér une caractère dans la chaine
        }
        System.out.println(inverse);
        return inverse;
    }
    public static String inverserChaineRecursive(String st) {
        String inverse="";
        for(int i=st.length()-1;i>=0;i--){
            inverse+=st.charAt(i);
        }
        return st;
    }


}
