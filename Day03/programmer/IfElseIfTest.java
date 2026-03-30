package programmer;

import java.util.Scanner;

/**
 *  if-else-if 语句
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:27
 */
public class IfElseIfTest {
    public static void main(String[] args) {
        // 从键盘输入一个成绩，如果成绩超过0-100这个范围，提示成绩错误
        // 如果成绩是100,返回满分
        // 如果成绩是60一下，返回不及格
        // 如果成绩是85-100，返回优秀
        // 如果成绩是60-85,返回合格
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个成绩：");
        int score = scanner.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("成绩错误");
        } else if (score == 100) {
            System.out.println("恭喜，满分，奖励一个小昭姐姐");
        } else if (score >= 85) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不及格");
        }
    }
}
