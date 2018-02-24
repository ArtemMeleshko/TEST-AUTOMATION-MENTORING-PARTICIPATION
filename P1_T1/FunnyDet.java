public class Determinant {
    public static void main(String[] args) {
        int matrixOne[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 5, 9}};


        int a;

        a = matrixOne[0][0] * matrixOne[1][1] * matrixOne[2][2] +
                matrixOne[0][1] * matrixOne[1][2] * matrixOne[2][0] +
                matrixOne[0][2] * matrixOne[1][0] * matrixOne[2][1] -
                matrixOne[0][2] * matrixOne[1][1] * matrixOne[2][0] -
                matrixOne[0][0] * matrixOne[1][2] * matrixOne[2][1] -
                matrixOne[0][1] * matrixOne[1][0] * matrixOne[2][2];

        System.out.println("args = [" + a + "]");

    }
}
