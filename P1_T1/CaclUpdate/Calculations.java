
import java.util.Scanner;

public class Calculations {
    int first, second, result;
    String oper, YorN;
    String frst = "\nEnter a 1st number:";
    String sec = "\nEnter a 2nd number:";
    String operation = "\nEnter an operation: + - / * ";
    String zero = "\nYou can not divide it by zero";
    String repeat = "\nDo you want to repeat? Y/N";
    String thanks = "\nThank you for using this program.";
    String incorrectOperation = "\nUnfortunately, our program can not perform this operation: ";

    Scanner in = new Scanner(System.in);

    public void calculations() {

        System.out.println(frst);
        first = in.nextInt();
        System.out.println(sec);
        second = in.nextInt();

        System.out.println(operation);
        oper = in.next();

        System.out.println("You entered: " + first + " " + oper + " " + second);
        //System.out.printf("int1 = %d, int2 = %d", first, second);

        switch (oper) {
            case "+":
                result = first + second;
                System.out.println("\n" + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("\n" + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("\n" + first + " * " + second + " = " + result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println(zero + repeat);
                    YorN = in.next();

                    if (YorN.equals("Y")) {
                        calculations();
                    } else
                        System.out.println(thanks);
                    break;

                } else {
                    result = first + second;
                    System.out.println("\n" + first + " / " + second + " = " + result);
                }


                break;
            default:
                
            System.out.println(incorrectOperation + oper + repeat);
                YorN = in.next();

                if (YorN.equals("Y")) {
                    calculations();
                } else
                    System.out.println(thanks);
                break;

        }


    }
}

