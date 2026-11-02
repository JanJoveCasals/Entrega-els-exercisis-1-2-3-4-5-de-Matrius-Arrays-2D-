public class main {
    public static void main(){
        String [][] X = new String [5][5];
        for (int i=0; i<X.length; i++){
            for (int j=0; j<X.length; j++){
                if (i==j || i+j == X.length-1){
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