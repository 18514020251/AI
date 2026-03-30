package programmer;

/**
 *  条件运算符
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 13:30
 */
public class ConditionOperatorTest {
    public static void main(String[] args) {
        boolean marry = false;
        System.out.println(marry ? "已婚" : "未婚");
        int num = 5;
        System.out.println(5 %2 == 0 ? "偶数" : "奇数");
        System.out.println("==========  ==========");
        int x = 6;
        int y = 6;
        System.out.println("x = " + x + " y = " + y + "其中大的数是：" + (x > y ? x : y));
        System.out.println("==========  ==========");
        int m = 5;
        int n = 7;
        int p = 3;
        System.out.println((m > n ? m : n) > p ? (m > n ? m : n) : p);// 可读性差
        int max = m > n ? m : n;
        max = max > p ? max : p;
        System.out.println("max = " + max);

        System.out.println("==========  ==========");
        int a = 1;
        char c = 'a';
        System.out.println(false ? a : c);
        System.out.println(true ? 'a' : 86);
        System.out.println(false ? 1 : 65536);
    }
}
