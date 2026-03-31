package programmer;

import java.util.Scanner;

public class ArrayExercise4 {
    public static void main(String[] args) {
        /*
        （1）已知平年12个月每个月的总天数是{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31}，
        （2）从键盘输入年，月，日，分别用year，month，day变量接收
        （3）计算这一天是这一年的第几天。
        （4）提示：闰年的判断标准
        - 年份year可以被4整除，但不能被100整除
        - 或年份year可以被400整除
         */
        int[] totalDaysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        System.out.print("请输入年 月 日");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        //假设输入是合法

        /*//单独处理
        if (month > 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                totalDaysOfMonth[1] = 29;
            }
        }*/

        /*
        （1）[1, month-1]满月天数    totalDaysOfMonth[0] ~ totalDaysOfMonth[month-2]
        （2）第month月的day天
         */
        int days = day; //这么写表示day天已经加到days变量中
        for (int i = 0; i < month - 1; i++) {
            if(i == 1){//i=1，处理2月份
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days++;
                }
            }
            days += totalDaysOfMonth[i];
        }
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");

        input.close();
    }
}
