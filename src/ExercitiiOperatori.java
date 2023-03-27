public class ExercitiiOperatori {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a/b);
        System.out.println(b%a);
        System.out.println(a%b);
        System.out.println(a!=b);
        System.out.println(a>b && b<a);
        System.out.println(6>a || 2<b);
        System.out.println(6>a && 2<b);
        System.out.println(5<a || (8>=b && b<a));
        System.out.println(9>a || (3>b && b<a));
        System.out.println(9>a && (5<b || a<b));
        System.out.println(2+a - (a+b-b/2 + a*1));
    }
}
