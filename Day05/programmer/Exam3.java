package programmer;

import java.util.Scanner;

/**
 * 3的倍数
 * */
public class Exam3{
    public static void main(String[] args){
        //从键盘输入一个正整数，且必须是3的倍数，否则重新输入。提示输入整数用  input.nextInt();
        Scanner input = new Scanner(System.in);

        /*while(true) {
            System.out.print("请输入一个正整数，且必须是3的倍数：");
            int num = input.nextInt();

            if(num > 0 && num%3==0){
                System.out.println("num = " + num);
                break;
            }else{
                System.out.println("输入错误!");
            }
        }*/

        int num;
         do{
            System.out.print("请输入一个正整数，且必须是3的倍数：");
            num = input.nextInt();

            if(num<=0 || num%3!=0){
                System.out.println("输入错误！");
            }
        }while(num<=0 || num%3!=0);

        System.out.println("num = " + num);

        input.close();
    }
}
