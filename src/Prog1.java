import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner h =new Scanner(System.in);
        System.out.println("Enter your number");
        int number = h.nextInt();
        isItOddOrEvenNumber(number);
        // closing the scanner object

    }

    // Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}


























