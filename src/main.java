import java.util.Scanner;

public class main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int fil = input.nextInt();
        int col = input.nextInt();
        int[][] numeros = new int[fil][col];
        int[][] operacions = new int[3][fil];
        int[] numgran = new int[fil];
        int[] numpetit = new int[fil];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = input.nextInt();
                numpetit[i] = numeros[i][0];
                numgran[i] = numeros[i][0];
            }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                operacions[0][i] += numeros[i][j];
                if (numeros[i][j] > numgran[i]) {
                    numgran [i] = numeros[i][j];
                    operacions [1][i] = numgran[i];
                }
                if (numeros[i][j] < numpetit[i]) {
                    numpetit [i] = numeros[i][j];
                    operacions [2][i] = numpetit[i];
                }
            }
        }
        for (int i = 0; i < operacions.length; i++) {
            for (int j = 0; j < operacions[i].length; j++) {
                System.out.println(operacions[i][j]);
            }
        }
    }
}