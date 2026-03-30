package programmer;

import java.util.Scanner;

/**
 *  输入语句1
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 14:06
 */
public class InStatementTest1 {
    public static void main(String[] args) {
        /*
        * System.out 输出语句
        * System.in 输入语句
        *
        * Scanner scanner = new Scanner(System.in);
        * 这句代码中只有一句话可以修改
        * scanner是一个标识符，或者他是一个变量名
        *
        * scanner的命名遵循标识符的命名规范
        * */
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入你的名字：");
            String name = scanner.next();
            System.out.print("请输入你的年龄：");
            int age = scanner.nextInt();
            System.out.print("请输入体重:");
            double weight = scanner.nextDouble();
            System.out.print("请输入性别:");
            char gender = scanner.next().charAt(0);
            System.out.print("是否单身:");
            boolean single = scanner.nextBoolean();
            scanner.close();
            // 涉及到io操作，可能会导致虚拟机以外的内存不能得到及时释放，导致程序无法结束
            System.out.println("name = " + name);
            System.out.println("age = " + age);
            System.out.println("weight = " + weight);
            System.out.println("gender = " + gender);
            System.out.println("single = " + single);
        } catch (Exception e) {
            System.out.println("请输入正确格式!");
        }
    }
}
