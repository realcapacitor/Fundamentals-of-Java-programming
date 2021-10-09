import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        //Write a program to print stars making a square shape of n*n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for \'n\' : ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
