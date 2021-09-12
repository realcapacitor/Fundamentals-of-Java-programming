public class AssignmentOperator {
    public static void main(String[] args) {
        //Assignment operator
        //1. Assignment operator(=)
        int a = 15;
        System.out.println("a = 15");

        
        //2. Modified assignment operators.
        a += 10; //a = a + 10;
        System.out.println("a += 10 : " + a);

        a -= 5; //a = a - 5;
        System.out.println("a -= 5 : " + a);

        a *= 3; //a = a * 3;
        System.out.println("a *= 3 : " + a);

        a /= 2; //a = a / 2;
        System.out.println("a /= 2 : " + a);

        a %= 7; //a = a % 7;
        System.out.println("a %= 7 : " + a);

        a <<= 2; // a = a << 2;
        System.out.println("a <<= 2 : " + a);

        a >>= 1; // a = a >> 1;
        System.out.println("a >>= 1 : " + a);

        a &= 5; // a = a & 5;
        System.out.println("a &= 5 : " + a);

        a |= 6; // a = a | 6;
        System.out.println("a |= 6 : " + a);
    }
}
