import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        //WhileLoop
        //Write a program to findout the sum of digits in the number.
        //523 = 5 + 2 + 3 = 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("The sum of digits of " + n + " is ");
        while(n>0){
            int mod = n % 10;
            sum += mod;
            n/=10;
        }
        System.out.println(sum);

        //Trick: to check number of digits.
        //n = 542
        //log(n)+1 = 3 
        System.out.print("Enter \'m\' : ");
        int m = sc.nextInt();
        int No = (int)Math.log10(m)+1;
        System.out.println(No);
    }
}
//Shivam