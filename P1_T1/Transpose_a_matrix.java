
import java.util.Scanner;
/**
 * Created by Artsiom_Mialeshka on 2/1/2018.
 */
public class matrix {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter matrix size, column and string:");

        int s1 = in.nextInt();
        int s2 = in.nextInt();

        System.out.println("\nYour matrix has size "+s1+" x "+s2 +
                            "\nEnter values of your matrix");

        int [][] arr = new int[s1][s2] ;

       for (int i = 0; i < s1; i++){
           for (int j = 0; j < s2; j++){
               arr[i][j] = in.nextInt();

            }
       }

       System.out.println("\nYour matrix is:");

        for (int i = 0; i < s1; i++){
            for (int j = 0; j < s2; j++){
               System.out.print(arr[i][j] + "  ");
            }
                System.out.println("");
        }

        System.out.println("\nYour transpose matrix is:");
        for (int i = 0; i < s1; i++){
            for (int j = 0; j < s2; j++){
                System.out.print(arr[j][i] + "  ");
            }
            System.out.println("");
        }

    }
}
