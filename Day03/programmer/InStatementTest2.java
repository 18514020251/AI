package programmer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 输入语句2
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 14:32
 */
public class InStatementTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("请输入三个整数 (整数之间用空格分隔):");

            if (!scanner.hasNextInt()) {
                System.out.println("错误：第一个输入不是有效的整数！");
                return;
            }
            int a = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                System.out.println("错误：第二个输入不是有效的整数！");
                return;
            }
            int b = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                System.out.println("错误：第三个输入不是有效的整数！");
                return;
            }
            int c = scanner.nextInt();

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        } catch (InputMismatchException e) {
            System.out.println("输入错误：请输入有效的整数！");
        } finally {
            scanner.close();
        }
    }
}
