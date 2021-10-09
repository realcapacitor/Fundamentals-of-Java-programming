import java.util.Scanner;
public class TrianglePattern {
    public static void main(String[] args) {
        //Write a program to print
        // *
        // *  *
        // *  *  *
        // *  *  *  *
        // *  *  *  *  *
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
