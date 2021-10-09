import java.util.Scanner;
public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a program to print
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *

        //solution:
        //----*-
        //---*-*-
        //--*-*-*-
        //-*-*-*-*-
        //*-*-*-*-*-
        //n = 5, spaces = n-i, and stars(*-) = i
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
