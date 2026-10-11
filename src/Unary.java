public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println(y);

        int a = 5;
        a = a + 1;
        System.out.println(a);
        a += 1;             //shorthand
        System.out.println(a);
        a++;           //post increment
        ++a;           //pre increment
        System.out.println(a);
        System.out.println("Watching increment");
        int p = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++p);
        System.out.println("watching decrement");
        int z = 8;
        System.out.println(--z);
        System.out.println(z);
        System.out.println(z--);
    }
}
