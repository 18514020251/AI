package programmer;

/**
 *  测试：循环输出1-10的数字
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 15:44
 */
public class ForTest2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("和为" + sum);

        System.out.println("==========  ==========");
        // 循环输出1-10的偶数
        int sumEven = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                System.out.println(i);
                sumEven += i;
            }
        }
        System.out.println("和为" + sumEven);
    }
}
