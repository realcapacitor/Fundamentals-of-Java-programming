import java.util.Scanner;
public class PalindromeNumber {
        public static void main(String[] args) {
        //Write a program to check if the given number is palindrome or not
        //ex. 12321, 56965, etc.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        //n = 545
        while(temp>0){
            int lastDigit = temp%10;
            reverse = reverse * 10 + lastDigit;
            temp/=10;
        }
        if(n == reverse)    System.out.print("The given number : " + n + " is a palindrome number : ");
        else    System.out.print("The given number is not a palindrome number : ");
        System.out.println(reverse);
    }
}
//Shivam