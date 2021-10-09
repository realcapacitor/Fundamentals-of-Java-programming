import java.util.Scanner;
public class MatricAdd {
    public static void main(String[] args){
        //MatricAdd
        //Write a program to input two matrices and print their addition.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        int a[][] = new int[m][n]; 
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("Enter matrix \'a\' ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix \'b\' ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("\nThe result is : ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
