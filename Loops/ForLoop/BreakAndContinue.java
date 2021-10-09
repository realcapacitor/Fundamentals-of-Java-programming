import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
        //BreakAndContinue
        Scanner sc = new Scanner(System.in);
        //Ex. Write a program using continue statement to print even numbers and neglecting odd ones.
        int n = sc.nextInt();
        for(int i = 2; i<=n; i++ ){
            if(i%2==0)  System.out.println(i);
            else continue;
        }

    }
}
