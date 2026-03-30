package programmer;

import java.util.Scanner;

/**
 * 输入语句4nextLine()和其他混用问题分析及解决
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:10
 */
public class InStatementTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入你的编号:");
        int id = sc.nextInt();// 编号+回车
        //sc.nextLine(); // 解决方法：用这个吃掉空格

        System.out.print("请输入姓名:");
        String name = sc.nextLine();// 读取了编号后面的回车

        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
}
