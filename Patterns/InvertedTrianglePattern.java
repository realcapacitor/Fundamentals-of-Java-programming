import java.util.Scanner;
public class InvertedTrianglePattern {
    public static void main(String[] args) {
        // Write a program to print the Inverted Triangle Pattern
        // *  *  *  *  *
        // *  *  *  *
        // *  *  *
        // *  *
        // *
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        for(int i = n; i>=0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
//Shivam