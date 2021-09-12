public class LogicalOperators {
    public static void main(String[] args) {
        //LogicalOperators
        //&&(And operator)
        int a = 5;
        int b = 10;
        boolean c = (a==5) && (b==10);
        System.out.println(c);

        //||(Or operator)
        int d = 10;
        int e = 5;
        boolean f = (d==10) || (e==10);
        System.out.println(f);
        
        //!(Not opearator)
        int g = 12;
        boolean h = !(g==10);
        System.out.println(h);
    }
}
