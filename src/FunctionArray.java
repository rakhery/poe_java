import java.util.Arrays;

public class FunctionArray {
    static int[] produceSumArray(int[] tableauNombre1,int[] tableauNombre2){
        int taille=tableauNombre1.length;
        int[] tableauResultant=new int[taille];
        for(int i=0;i<taille;i++){
            tableauResultant[i]=tableauNombre1[i]+tableauNombre2[i];
        }
        return tableauResultant;
    }
    public static void main(String[] args) {
        int[] tb1={1,2,3,4,5};
        int[] tb2={6,7,8,9,10};
        int[] tbResultant=produceSumArray(tb1,tb2);
        System.out.println(Arrays.toString(tbResultant));
    }
}
