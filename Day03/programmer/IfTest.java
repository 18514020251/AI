package programmer;

import java.util.Scanner;

/**
 *  if语句
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:17
 */
public class IfTest {
    // 需求：从键盘输入一个年份，如果年份是闰年，则总天数+1天
    public static void main(String[] args) {
        int totalOfYear = 365;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("闰年");
            totalOfYear += 1;
            System.out.println("总天数：" + totalOfYear);
        } else {
            System.out.println("平年");
            System.out.println("总天数：" + totalOfYear);
        }
        scanner.close();
    }
}
