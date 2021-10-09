import java.util.Scanner;
public class HackerRank2 {
    public static void main(String[] args) {
        // In this challenge, you must read an integer, a double, and a String from stdin,
        // then print the values according to the instructions in the Output Format section below.
        // Sample Input
        // 42
        // 3.1415
        // Welcome to HackerRank's Java tutorials!
        // Sample Output
        // String: Welcome to HackerRank's Java tutorials!
        // Double: 3.1415
        // Int: 42
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
