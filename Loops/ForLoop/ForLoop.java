import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        //ForLoop
        //Even numbers from 0 to n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Even numbers from 0 to n\nEnter n : ");
        int a = sc.nextInt();
        for(int i = 1 ; i<=a; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        //Factorial of number
        System.out.print("Enter number for finding factorial : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int j=1; j<=n; j++){
            fact *= j;
        }
        System.out.println("The factorial : " + n + "! = " + fact);
    }
}
