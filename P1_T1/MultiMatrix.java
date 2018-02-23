import java.sql.SQLOutput;

public class Mult {
    public static void main (String[] args) {

    int[][] A = {{1,2},{11,22}};
    int[][] B = {{9,8,3},{5,4,9}};

    int[][] C = new int [A.length][B[0].length];

        System.out.println(A.length +" " + B[0].length +"\n");

    for(int i  = 0; i < A.length; i++){
        for(int j = 0; j < B[i].length; j++){
           // System.out.print(A[i][j]);
            for(int k = 0; k < B.length; k++){

               C[i][j] += A[i][k] * B[k][j];

                System.out.println("C" + i + j + "=" + "A"+ i + k + "*" + "B" + k + j + "=" + C[i][j] + "=" + A[i][k] + "*" + B[k][j]);

            }
        }
    }
        for(int i  = 0; i < C.length; i++){
            for(int j = 0; j < C[i].length; j++){
                 System.out.print(C[i][j]+ " ");

            }
            System.out.println(" ");
        }


    }
}
