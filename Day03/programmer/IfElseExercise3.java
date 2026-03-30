package programmer;

import java.util.Scanner;

/**
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 15:39
 */
public class IfElseExercise3 {
    /*
    假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票
    提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
    1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
    2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3000美元。
    3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1000美元。
    4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
    5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
    提示:使用Math.random()产生随机数
    Math.random()产生随机数
    * */
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个两位数：");
        int input = scanner.nextInt();
        if (input == num) {
            System.out.println("奖金10 000美元");
        } else if (input / 10 == num / 10 && input % 10 == num % 10) {
            System.out.println("奖金3000美元");
        } else if (input / 10 == num % 10 && input % 10 == num / 10) {
            System.out.println("奖金1000美元");
        } else if (input / 10 == num / 10 || input / 10 == num % 10 || input % 10 == num / 10 || input % 10 == num % 10) {
            System.out.println("奖金500美元");
        } else {
            System.out.println("彩票作废");
        }
    }
}
