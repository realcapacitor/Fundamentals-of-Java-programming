import java.util.Scanner;
public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a code to print hollow triangle.
        // *
        // * *
        // *   *
        // *     *
        // * * * * *

        //*-
        //*-*-
        //*---*-
        //*-----*-
        //*-*-*-*-*-
        // n=5, i=n-1, if(i<n)
        System.out.print("Enter \'n\' : ");
        int n = sc.nextInt();
        System.out.println("* ");
        for(int i = 1; i<=n-2; i++){
            System.out.print("* ");
            if(i>1 && i<n-1){
                for(int j=1; j<i; j++){
                    System.out.print("  ");
                }
            }
               System.out.println("*");
        }
        for(int i =0; i<n; i++){
            System.out.print("* ");
        }
    }
}
//Shivam