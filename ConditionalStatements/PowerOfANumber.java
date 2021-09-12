import java.util.Scanner;
public class PowerOfANumber {
    public static void main(String[] args) {
        //PowerOfANumber
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for finding its power : ");
        int n = sc.nextInt();
        System.out.print("Enter power : ");
        int p = sc.nextInt();
        int result = 1;
        for(int i =0; i<p; i++){
            result *= n; 
        }
        System.out.println(result);

    }
}
