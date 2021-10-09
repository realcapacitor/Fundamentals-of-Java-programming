import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
         //Factorial of number
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number for finding factorial : ");
         int n = sc.nextInt();
         int fact = 1;
         for(int j=1; j<=n; j++){
             fact *= j;
         }
         System.out.println("The factorial : " + n + "! = " + fact);
    }
}