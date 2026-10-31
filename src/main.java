
import java.util.Scanner;

public class main{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Files:");
        int fil = input.nextInt();
        System.out.println("Columnes:");
        int col = input.nextInt();
        int [][] numeros = new int [fil][col];
        int [][] operacions = new int [3][col];

        for (int i=0; i<numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("fila: " + i + " columna: " + j);
                numeros[i][j] = input.nextInt();
                operacions[0][j] += numeros[i][j];
                if (i >= 1 && numeros [i][j] > numeros [i-1][j]){
                    int canvi = numeros [i-1][j];
                    numeros [i-1][j] = numeros[i][j];
                    numeros [i][j] = canvi;
                }
            }
        }

        for (int i=0; i<operacions.length;i++){
            for (int j=0; j<operacions[i].length;j++){
                operacions[1][j] = numeros [0][j];
                operacions[2][j] = numeros [numeros[i].length-1][j];
            }
        }

        for (int i = 0; i< operacions.length; i++){
            for (int j = 0; j< operacions[i].length; j++){
                System.out.print(operacions[i][j] + " ");
            }
            System.out.println();
        }
    }
}