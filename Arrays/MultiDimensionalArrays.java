import java.util.Scanner;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //MultiDimensionalArrays
        //int MultsArray[][] = new int[3][3];
         int MultsArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(MultsArray[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
