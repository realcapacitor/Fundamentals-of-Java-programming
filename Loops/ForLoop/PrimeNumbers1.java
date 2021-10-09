import java.util.Scanner;
public class PrimeNumbers1 {
    public static void main(String[] args) {
        //PrimeNumber1
        //Program to check whether the number given is a prime number or not.
        //1 is not a prime number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is prime number or not : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i*i <= n; i++){//Here I took condition i*i <= n, cause it is same as i<= root(n),
            //Logic:    as we know a number can be divided only by the numbers less than it root.
            //for ex. 16 can only be divided by either 4 or the number less than 4.
            // 4*4=16, 8*2 = 16(Here 2 is less than 4).
            if(n%i == 0){
                System.out.println(n + " is divisible by " + i);
                int div = n / i;
                System.out.println(div + " X " + i + " = " + n);    
            isPrime = false;
            break;
            }
        }
        if(n==1)    isPrime = false;
        System.out.println(n + " is a prime number? : " + isPrime);
    }
}
