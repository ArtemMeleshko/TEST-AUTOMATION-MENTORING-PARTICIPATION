package com.example.calculator;

import java.util.Scanner;


public class countUp {

    public static void main(String[] args) {

        String fst = "\nEnter a 1st number";
        String sec = "\nEnter a 2nd number";

        Scanner in = new Scanner(System.in);

        System.out.println(fst);
        int num1 = in.nextInt();

        System.out.println(sec);
        int num2 = in.nextInt();


        System.out.printf("int1 = %d, int2 = %d", num1, num2);

        System.out.println("\nSelect operation: \n1)+ \n" +
                "2)- \n" +
                "3)* \n" +
                "4)/ \n");

        int oper = in.nextInt();

        //System.out.printf("oper=%d",oper);

        switch (oper) {
            case 1:
                int result = num1 + num2;
                System.out.printf("\n" + num1 + "+" + num2 + "=" + result);
                break;
            case 2:
                int result1 = num1 - num2;
                System.out.printf("\n" + num1 + "-" + num2 + "=" + result1);
                break;
            case 3:
                int result2 = num1 * num2;
                System.out.printf("\n" + num1 + "*" + num2 + "=" + result2);
                break;

            case 4:
                int result3 = num1 / num2;
                System.out.printf("\n" + num1 + "/" + num2 + "=" + result3);

                break;

            default:

                System.out.println("\n" + oper + ",Cannot find this command, sorry" );


        }


    }
}

