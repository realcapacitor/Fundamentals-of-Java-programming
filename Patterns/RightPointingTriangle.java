import java.util.Scanner;
public class RightPointingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a program to print 
        // *
        // *  *
        // *  *  *
        // *  *  *  *
        // *  *  *  *  *
        // *  *  *  *
        // *  *  *
        // *  *
        // *

        //solution:
        //*-
        //*-*-
        //*-*-*-
        //*-*-*-*-
        //*-*-*-*-*-
        //*-*-*-*-
        //*-*-*-
        //*-*-
        //*-
        //
        //Now lets divide this problem into two parts
        // upper 5 lines as a isosceles triangle and lower 4 lines as a inverted isosceles triangle.
        //1.upper triangle:
        //n = 5, i = 5, j(*-) = i
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        //2.Lower triangle:
        //i = 4, j(*-) = i
        for(int i = n-1; i>=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print("*  ");
            }
            System.out.println();
        } 
        
    }
}
