package programmer;

import java.util.Scanner;

/**
 * if语句2
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:20
 */
public class IfTest2 {
    public static void main(String[] args) {
        // 需求：从键盘输入一个整数，如果是3的倍数，输出three，如果是5的倍数，输出five，如果是3和5的倍数，输出three five
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("three five");
        } else if (number % 3 == 0) {
            System.out.println("three");
        } else if (number % 5 == 0) {
            System.out.println("five");
            scanner.close();
        }
    }
}
