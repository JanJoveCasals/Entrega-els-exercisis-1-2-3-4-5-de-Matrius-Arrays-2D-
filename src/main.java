import java.util.Scanner;
import java.util.Scanner;

public class main{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Numeros de files: ");
        int fil = input.nextInt();
        System.out.println("Numeros de columnes: ");
        int col = input.nextInt();
        int [][] numeros = new int [fil][col];
        int [][] suman = new int [3][col];

        for (int j=0; j<col; j++){
            System.out.println("Columna: " + j);
            for (int i=0; i<fil; i++){
                System.out.println("Fila: " + i);
                numeros[i][j] = input.nextInt();
                suman [0][j] += numeros[i][j];
            }
            suman [1][j] = numeros [0][j];
            suman [2][j] = numeros [0][j];
        }

        for (int j=0; j<col; j++) {
            for (int i = 0; i < fil; i++) {
                if (numeros[i][j] < suman[1][j]) {
                    suman[1][j] = numeros[i][j];
                }
                if (numeros[i][j] > suman[2][j]) {
                    suman[2][j] = numeros[i][j];
                }
            }
        }

        for (int i=0; i<fil; i++){
            for (int j=0; j<col;j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i=0; i<3; i++){
            for (int j = 0; j <col; j++){
                System.out.print(suman[i][j] + " ");
            }
            System.out.println();
        }
    }
}