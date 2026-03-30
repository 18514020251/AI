package programmer;

/**
 *  算术运算符3
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 12:47
 */
public class AssignOperatorTest2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // 交换a,b变量的值
        // 最基本的操作，借助第三个变量
        int temp = a; // 把a的值保存到temp中
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("==========  ==========");
        // 了解:有缺陷，i+j可能出现溢出
        int i = 1;
        int j = 2;

        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
