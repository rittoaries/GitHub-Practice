import java.util.Scanner;

public class Calculator {

      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number");
            int NumA = scanner.nextInt();

            System.out.println("Enter second number");
            int NumB = scanner.nextInt();

            System.out.println("Enter operator"); 
            char Operator = scanner.next().charAt(0);

            int result = 0;

            switch (Operator) {
                  case '+':
                        result = NumA + NumB;
                        System.out.println("Sum is " + result);
                        break;

                  case '-':
                        result = NumA - NumB;
                        System.out.println("Difference is " + result);
                        break;

                  case '*':
                        result = NumA * NumB;
                        System.out.println("Product is " + result);
                        break;

                  case '/':
                        result = NumA / NumB;
                        System.out.println("Divides is " + result);
                        break;

                  case '%':
                        result = NumA / NumB;
                        System.out.println("Divides is " + result);
                        break;

                  default:
                        System.out.println("Operator not found!");
                        break;
            }

      }
}