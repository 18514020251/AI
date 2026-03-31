package programmer;

import java.util.Scanner;

public class ArrayArithmetic2 {
    public static void main(String[] args) {
        //需求：从键盘输入你们组的人数，以及每一个人的成绩，成绩存到数组中，然后输出你们组的总分，平均分。
        Scanner input = new Scanner(System.in);

        //（1）输入人数
        int count;
        while(true) {
            System.out.print("请输入本组的人数：");
            count = input.nextInt();
            if(count>0){
                break;
            }else if(count>Integer.MAX_VALUE){
                System.out.println("输入错误，人数太多了");
            }else{
                System.out.println("输入错误，人数应该为正数！");
            }
        }

        //（2）定义数组，长度为count，元素类型可以是int或double
        int[] score = new int[count];

        //（3）输入成绩
        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第" +(i+1) +"个同学的成绩：");
            score[i] = input.nextInt();//成绩其实也有有效性的判断，这里没写
        }

        //(4)统计总分和平均分
        int sum = 0;
        System.out.println("大家的成绩如下：");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i]+" ");
            sum += score[i];
        }
        System.out.println();
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + (double)sum/count);

        input.close();
    }
}
