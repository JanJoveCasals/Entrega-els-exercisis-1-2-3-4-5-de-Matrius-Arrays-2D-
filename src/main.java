import java.util.Scanner;

public class main {
    public static void main(){
        String [][] X = new String [5][5];
        for (int i=0; i<X.length; i++){
            for (int j=0; j<X.length; j++){
                if (i==0 || i==4 || i==j){
                    X[i][j] = "[X]";
                }else{
                    X[i][j] = "[ ]";
                }
            }
        }
        for (int i=0; i<X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    }
}