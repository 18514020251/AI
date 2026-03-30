package programmer;

/**
 *  算术运算符2
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 12:38
 */
public class AssignOperatorTest {
    public static void main(String[] args) {
        System.out.println("==========  ==========");
        int i =1;
        int j = 2;
        i += j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("==========  ==========");
        int k = 3;
        int n = 6;
        k *= k + n;
        System.out.println("k = " + k);

        System.out.println("==========  ==========");
        byte b1 = 1;
        byte b2 = 127;
        b1 += b2;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
    }
}
