import java.util.Scanner;

public class main {
    public static void main(){
        Scanner input = new Scanner(System.in);
        int fil = input.nextInt();
        int col = input.nextInt();
        int [][] numeros = new int [fil][col];
        int [] suman = new int [fil];

        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length;j++){
                numeros[i][j] = input.nextInt();
                suman [i] += numeros[i][j];
            }
        }
        for (int i=0; i<numeros.length; i++){
            System.out.println(suman[i]);
        }
    }
}