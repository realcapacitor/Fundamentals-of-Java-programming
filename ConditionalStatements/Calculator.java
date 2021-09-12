import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        //Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        float result = 0f;

        System.out.print("Enter number : ");
        int a = sc.nextInt();

        System.out.print("Enter Operation : ");
        sc.nextLine();

        char operation = sc.nextLine().charAt(0);
        System.out.print("Enter number : ");
        int b = sc.nextInt();

        switch(operation){
            case '+':
            result = a + b;
            break;
            case '-':
            result = a - b;
            break;
            case '*':
            result = a * b;
            break;
            case '/':
            result = (float)a / b;
            break;
            case '%':
            result = a % b;
            break;
            default :
            System.out.println("Enter a valid operation");
        }
        System.out.println("The result is " + result);
    }   
}
