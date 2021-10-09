import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;
public class InvertedTrianglePattern2 {
    public static void main(String[] args) {
        //Write a program to print
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        int m = n;
        for(int i = 1; i<=n; i++){
            for(int j =m; j>1; j--){
                System.out.print("  ");
            }
            for(int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
            m--;
        }
    }
}
//Shivam