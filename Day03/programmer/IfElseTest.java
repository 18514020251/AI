package programmer;

import java.util.Scanner;

/**
 *  if-else语句
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:24
 */
public class IfElseTest {
    public static void main(String[] args) {
        // 需求，从键盘输入一个整数，输出他是基数还是整数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
