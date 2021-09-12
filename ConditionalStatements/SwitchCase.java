import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        //SwitchCase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
            System.out.println("Two");
            break;
            default:
            System.out.println("Not one or two");
                break;
        }
    }
}
