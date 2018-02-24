
import java.util.Scanner;

public class Calculations {
    Double first, second, result;
    String oper, YorN;
    String frst = "\nEnter a 1st number:";
    String sec = "\nEnter a 2nd number:";
    String operation = "\nEnter an operation: + - / * ";
    String zero = "\nYou can not divide it by zero";
    String repeat = "\nDo you want to repeat? Y/N";
    String thanks = "\nThank you for using this program.";
    String incorrectOperation = "\nUnfortunately, our program can not perform this operation. ";
    String notNumber = "\nThat not a number! Enter again";


    Scanner in = new Scanner(System.in);

    private void firstValue() {
        System.out.println(frst);

        while (!in.hasNextDouble() && !in.hasNextInt()) {
            System.out.println(notNumber);
            in.next();
        }

        first = in.nextDouble();

    }

    private void secondValue() {
        System.out.println(sec);

        while (!in.hasNextDouble() && !in.hasNextInt()) {
            System.out.println(notNumber);
            in.next();
        }

        second = in.nextDouble();

    }

    private void oper() {
        System.out.println(operation);
        while (!in.hasNext("[+-/*]")) {
            System.out.println(incorrectOperation + operation);
            in.next();
        }
        oper = in.next();
    }

  /* private static String input(double first, double second) {
            if(first == (long) first)
                return String.format("%d",(long)first);
            else
                return String.format("%s",first);

    }*/

    private void repeatOrNot() {
        System.out.println(repeat);
        YorN = in.next();

        if (YorN.equals("Y")) {
            calculations();
        } else
            System.out.println(thanks);

    }


    public void calculations() {

        firstValue();
        oper();
        secondValue();
        //input(first,second);

        switch (oper) {
            case "+":
                result = first + second;
                System.out.println("\n" + first + " + " + second + " = " + result);
                repeatOrNot();
                break;
            case "-":
                result = first - second;
                System.out.println("\n" + first + " - " + second + " = " + result);
                repeatOrNot();
                break;
            case "*":
                result = first * second;
                System.out.println("\n" + first + " * " + second + " = " + result);
                repeatOrNot();
                break;
            case "/":
                if (second == 0) {
                    System.out.println(zero);
                    repeatOrNot();
                    break;

                } else {
                    result = first / second;
                    System.out.println("\n" + first + " / " + second + " = " + result);
                    repeatOrNot();
                }
                break;
            default:
                System.out.println(incorrectOperation + oper);
                repeatOrNot();
                break;

        }


    }
}
