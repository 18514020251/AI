package programmer;

import java.util.Scanner;
/**
 * 数组练习3
 * */
public class ArrayTest3 {
    public static void main(String[] args) {
        //要存储5个成绩
        //元素的类型[] 数组名 = new 元素的类型[长度];
        //数组名[下标]  与  数据类型[长度]
        //下标的范围是[0, 长度-1]
        int[] score = new int[5];

        //给元素赋值
        /*score[0] = 89;
        score[1] = 96;
        score[2] = 85;
        score[3] = 75;
        score[4] = 100;*/

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第" + (i+1) +"个同学的成绩：");
            score[i] = input.nextInt();
        }

        System.out.print("他们的成绩如下：");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] +" ");
        }
        System.out.println();


        input.close();

    }
}
