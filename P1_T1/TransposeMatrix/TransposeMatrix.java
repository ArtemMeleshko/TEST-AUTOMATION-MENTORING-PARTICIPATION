import java.util.Scanner;

public class TransposeMatrix {
    int s1, s2;
    int[][] arr;


    private void enterMatrix() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter matrix size, column:");
        s1 = in.nextInt();
        System.out.println("\nand row: ");
        s2 = in.nextInt();

        System.out.println("\nYour matrix has size " + s1 + " x " + s2 +
                "\nEnter values of your matrix");

        arr = new int[s1][s2];

        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                arr[i][j] = in.nextInt();

            }
        }

        System.out.println("\nYour matrix is:");

        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public void transpose() {

        enterMatrix();

        System.out.println("\nYour transpose matrix is:");
        for (int i = 0; i < s2; i++) {
            for (int j = 0; j < s1; j++) {
                System.out.print(arr[j][i] + "  ");
            }
            System.out.println("");
        }

    }
}
