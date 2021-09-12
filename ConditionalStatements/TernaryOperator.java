import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        //TernaryOperator(Shorthand for if...else)
        //variable = condition ? expressionIfTrue : expressionIfFalse;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter either 5 or 10 : ");
        int a = sc.nextInt();
        //Example 1. If a is equal to 5, then assign b = 10, else vice versa.
        int b = a==5 ? 10 : 5 ;
        System.out.println(b);

        //Example 2. Assign max of the two numbers to the variable max.
        int x = 10;
        int y = 15;
        int max = x > y ? x : y ;
        System.out.println("Max of x : " + x + " and y : " + y + " is max : " + max);
    }
}
