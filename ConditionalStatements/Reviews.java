import java.util.Scanner;
public class Reviews {
    public static void main(String[] args) {
        //Reviews
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rating from 1-10 : ");
        int rating = sc.nextInt();
        //If the rating is 1-3 : bad, 4-6 : Average, 7-8 : Good and 9-10 : Excellent.
        switch(rating){
            case 1:
            case 2:
            case 3:
            System.out.println("The rating is Bad");
            break;
            case 4:
            case 5:
            case 6:
            System.out.println("The rating is Average");
            break;
            case 7:
            case 8:
            System.out.println("The rating is Good");
            break;
            case 9:
            case 10:
            System.out.println("The rating is Excellent");
            break;
            default:
            System.out.println("Enter valid rating from 1-10");
        }
    }
}
