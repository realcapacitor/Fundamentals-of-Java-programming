import java.util.Scanner;
public class SeriesSum1 {
    public static void main(String[] args) {
        //Write a program to calculate the sum of the following series where n is the input from user.
        //1 - 1/2 + 1/3 - 1/4 +... 1/n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for \'n\' : ");
        int n = sc.nextInt();
        float result = 0;
        for(float i = 1; i<=n; i++){
            if(i%2==0)  result -= 1/i;
            else result += 1/i;
        }
        System.out.println("The series sum(1 - 1/2 + 1/3 - 1/4 +... 1/n) is " + result);
    }
}
