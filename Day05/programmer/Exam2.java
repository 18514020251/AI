package programmer;

/**
 * 使用循环输出平年12个月以及每个月总天数
 * */
public class Exam2 {
    public static void main(String[] args) {
        //使用循环输出平年12个月以及每个月总天数
        //1,3,5,7,8,10,12是31天，4,6,9,11是30天，2月是28天
        /*for(int i=1; i<=12; i++){
            if(i==2){
                System.out.println(i + "月是28天");
            }else if(i==4 || i==6 || i==9 || i==11){
                System.out.println(i + "月是30天");
            }else{
                System.out.println(i + "月是31天");
            }
        }*/

        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 2 -> System.out.println(i + "月是28天");
                case 4, 6, 9, 11 -> System.out.println(i + "月是30天");
                default -> System.out.println(i + "月是31天");
            }
        }
    }
}