import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ForString
        System.out.println("Enter string");
        String hello = sc.nextLine();
        System.out.println(hello);
        //ForInt
        System.out.println("Enter int");
        int x  = sc.nextInt();
        System.out.println(x);
        //ForDouble
        System.out.println("Enter double");
        double y = sc.nextDouble();
        System.out.println(y);
    }
}
