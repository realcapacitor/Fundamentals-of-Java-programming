public class TablesFrom1To20 {
    public static void main(String[] args) {
        //Write a program to print tables from 1 to 20. 
        for(int i = 1; i<=20; i++){
            for(int j = 1; j<=10; j++ ){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
