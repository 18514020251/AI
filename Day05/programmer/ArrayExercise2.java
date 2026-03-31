package programmer;

import java.util.Scanner;

public class ArrayExercise2 {
    /*
    （1）用一个数组，保存星期一到星期天的7个英语单词，数组如下：
    {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
    （2）从键盘输入1-7的整数，显示该整数对应的单词
     */
    public static void main(String[] args) {
        String[] weekName =  {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input = new Scanner(System.in);

        int week;
        while(true) {
            System.out.print("请输入[1,7]的星期值：");
            week = input.nextInt();

            if (week < 1 || week > 7) {
                System.out.println("输入有误！");
            }else{
                break;
            }
        }
        /*
        week=1，输出 weekName[0]
        week=2，输出 weekName[1]
        ...
         */
        System.out.println("星期值是" + week + ",对应的单词：" + weekName[week-1]);


        input.close();
    }
}
