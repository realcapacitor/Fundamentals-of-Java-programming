import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        //PrimeNumbers
        //Program to check if the give number is prime or not.
        // 1 is not a prime number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is prime number or not : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<=n/2 ; i++){//Here in condtion block I took n/2, cause any number can not be divided by a number, 
            //which is greater than its half.
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(n < 2)   isPrime = false;
        
            System.out.println(n + " is a prime number? : " + isPrime);
    }
}
