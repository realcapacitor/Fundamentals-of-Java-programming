import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args){
        //NestedIfElse
        //Greatest of three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is the greatest : " + a);
            }else{
                System.out.println("c is the greatest : " + c);
            }
        }else{
            if(b>c){
                System.out.println("b is the greatest : " + b);
            }else{
                System.out.println("c is the greatest : " + c);
            }
        }

        //TernaryOperators
        int result = a > b ? a > c ? a : c : b > c ? b : c;
        
        System.out.println("The biggest number is " + result);
    }
}
