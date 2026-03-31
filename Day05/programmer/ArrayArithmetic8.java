package programmer;

import java.util.Scanner;

public class ArrayArithmetic8 {
    public static void main(String[] args) {
        /*
        需求：随机产生10个[0,100)的整数，然后从键盘输入1个整数，看它在不在这个数组中
         */
        //(1)定义长度为10的数组
        int[] arr = new int[10];

        //(2)随机产生10个[0,100)的整数放到数组中，并且显示元素
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //(3)从键盘输入1个整数
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int target = input.nextInt();

        //(4)遍历数组，查找这个整数在不在数组中
        boolean flag = false;//false没找到
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }

        input.close();
    }
}
