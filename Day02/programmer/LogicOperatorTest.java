package programmer;

/**
 *  逻辑运算符
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 13:25
 */
public class LogicOperatorTest {
    public static void main(String[] args) {
        int age = 25;

        System.out.println(18 <= age & age <= 35);
        System.out.println("==========  ==========");
        int a = 1;
        int b = 2;
        System.out.println(a++ == 1 && b++ == 2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
