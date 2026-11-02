import java.util.Scanner;

public class main {
    public static void main(){
        Scanner input = new Scanner(System.in);
        int [][] notes = new int[2][6];
        for (int i=0; i<notes.length; i++){
            System.out.println("Alumne: " + i);
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota parcial: " + j);
                notes [i][j] = input.nextInt();
                suma += notes [i][j]; // suma notes
                notes [i][4] = notes [i][0]; // nota màxima
                notes [i][5] = notes [i][0]; // nota mínima
                if (notes [i][j] > notes [i][4]){
                    notes [i][4] = notes [i][j];
                }
                if (notes [i][j] < notes [i][5]){
                    notes [i][5] = notes [i][j];
                }
            }
            notes [i][3] = suma / 3;
        }for (int i=0; i<notes.length; i++){
            for (int j = 0; j <notes[i].length; j++) {
                System.out.print("[" + notes[i][j] + "]");
            }
            System.out.println();
        }

    }
}
