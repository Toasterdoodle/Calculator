import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1, num2, ans;

        String sign;

        Scanner userInput = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Enter in the first number:");

        num1 = userInput.nextDouble();

        System.out.println("Enter an operator:");

        sign = userInput.next();

        System.out.println("Enter in the second number:");

        num2 = userInput.nextDouble();

        System.out.println(calc.calculate(num1, num2, sign));

    }//end psvm

}//end class
