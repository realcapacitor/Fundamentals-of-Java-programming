import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        //Write a program to print Hello Java!!! unless user enters 0
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Enter \'n\' : ");
             n = sc.nextInt();
            System.out.println("Hello Java!!!" + n);
        }while(n!=0);
        sc.close();
    }
}
//Shivam