package programmer;

/**
 *  比较运算符
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 12:54
 */
public class RelationOperatorTest {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(a > b); // F
        System.out.println(a < b); // T
        System.out.println(a >= b); //  F
        System.out.println(a <= b); //  T
        System.out.println(a == b); //  F
        System.out.println(a != b); //  T

        System.out.println(a = b);// 1 把b的值复制给a 2 把a的值输出
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("==========  ==========");
        boolean flag = true;
        if (flag) { // 条件为true ， 成立， 输出flag
            System.out.println("flag = " + flag);
            System.out.println("Hello World！");
        }
        System.out.println("==========  ==========");
        if (flag = false){
            System.out.println("Test1");
        }
        if (flag == false){
            System.out.println("Test2 ");
        }
    }
}
