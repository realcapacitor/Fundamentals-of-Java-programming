public class BitwiseOperators {
    public static void main(String[] args) {
       //BitwiseOperators
       //Bitwise operators operates at bit level. 
       //1. Bitwise And(&)
       //For example
       int a = 4;
       // 4 -> 0100
       int b = 6;
       // 6 -> 0110
       //Now if use and operator between 4 and 6 we get,
       // 4 -> 0100
       // &
       // 6 -> 0110
       //      0100 which is equal to 4
       int c = a & b;
       System.out.println("Bitwise-and : 4 & 6 = " + c);
       //2. Bitwise Or(|)
       int x = 10;
       // 10 -> 1010
       int y = 14;
       // 16 -> 1110
       //Now if do the bitwise-or operation between 10 and 16 we get,
       // 10 -> 1010
       // |
       // 14 -> 1110
       //       1110 Which is equal to 14
       int z = x | y;
       System.out.println("Bitwise-or : 10 | 14 = " + z);

        System.out.println("\n\nLeft and right shifting.");
        //If we left shift any number, one zero will be added as the right most bit it, and will become double of that number.
        // 1101 <- 11010 <- 110100
        // 13   <-  26  <-  52
        int p = 13;
        int q = p << 1;
        System.out.println("Left shifting : ");
        System.out.println("p : " + p);
        System.out.println("p << 1 : " + q);
        q = p << 2;
        System.out.println("p << 2 : " + q);
        q = p << 3;
        System.out.println("p << 3 : " + q);

        //If we right shift any number, the right most but of that number will vanish, the number will be halved.
        // 1111 -> 0111 -> 0011 -> 0001
        //  15  ->  7   ->  3   ->   1
        int m = 15;
        int n = m >> 1;
        System.out.println("right shifting : ");
        System.out.println("m : " + m);
        System.out.println("m << 1 : " + n);
        n = m >> 2;
        System.out.println("m << 2 : " + n);
        n = m >> 3;
        System.out.println("m << 3 : " + n);

    }
}
