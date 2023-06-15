package programme_1_calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner declaration for object
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first number:");//input wizard
            int a = sc.nextInt();
            System.out.println("please enter second number:");//input wizard
            int b = sc.nextInt();
            System.out.println("Please enter on the symbol +,-,/,* :");// input wizard
            char symbol = sc.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would u like to do more calculation please enter “Y” or “N” :");//input wizard
            answer = sc.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //Closing a scanner object
        sc.close();
    }
}





