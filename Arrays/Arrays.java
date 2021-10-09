import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
      //Arrays
      Scanner sc = new Scanner(System.in);
      //Write a program to input 5 roll numbers, name of the students and their weight.
      int roll[] = new int[5];
      String name[] = new String[5];
      float weight[] = new float[5];
      for(int i = 0; i<5; i++){
        System.out.print("Enter roll number of the student : ");
        roll[i] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name of student : ");
        name[i] = sc.nextLine();
        System.out.print("Enter weight : ");
        weight[i] = sc.nextFloat();
      }
      System.out.println("Roll No.\tName\tWeight");
      for(int i = 0; i<5; i++){
        System.out.println(roll[i] + "\t" + name[i] + "\t" + weight[i]);
      }
      sc.close();
    }
}
//Shivam