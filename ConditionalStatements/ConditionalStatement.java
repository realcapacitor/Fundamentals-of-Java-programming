import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        //CondtionalStatements
        //if_else_ifelse
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        if(a<10){
            System.out.println("if block executed\na is less than 10.");
        }else if(a>=10 && a<=20){
            System.out.println("else if block executed\na is greater than or equal 10 but less than or equal 20.");
        }else{
            System.out.println("else block executed\na is greater than 20.");
        }
    }
}
