import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle ammount : ");
        int principle = sc.nextInt();
        System.out.print("Enter rate of interest : ");
        float rate = sc.nextFloat();
        System.out.print("Enter period in years : ");
        float period1 = sc.nextFloat();
        int period = (int) period1;
        float SimpleInterest = principle * rate * period / 100 ;
        System.out.println("Simple interest on principle ammount of Rs." + principle + " after " + period + " years by the rate of interest " + rate + "% per annum is Rs." + SimpleInterest + " only.");
    }
}