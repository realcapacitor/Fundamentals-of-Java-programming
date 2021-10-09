import jdk.jpackage.internal.AppImageFile;

import java.util.Scanner;
public class HackerRank3 {
    public static void main(String[] args) {
        //Write a program to print\n
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);//Here %-15s : denotes that the string is of 15 characters, %03d : denotes that the
            //int is of three digits and to add zeros if the it is lacking any digits, %n : new line character 
        }
        System.out.println("================================");

}
}



