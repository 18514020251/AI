package programmer;

import java.util.Scanner;

/**
 * 输入语句3
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:06
 */
public class InStatementTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入姓名:");
        //String name = scanner.next(); 名字不能包含空格
        String name = scanner.nextLine(); // 名字可以包含空格

        System.out.println("name = " + name);
    }
}
