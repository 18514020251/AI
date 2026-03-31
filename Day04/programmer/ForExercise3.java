package programmer;

/**
 *  习题：打印问题
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 15:55
 */
public class ForExercise3 {
    //3、从1循环到150并在每行打印一个值，另外在每个3的倍数行上打印出“foo”
    //在每个5的倍数行上打印“biz”，在每个7的倍数行上打印输出“baz”
    public static void main(String[] args) {
        //for (int i = 0; i <= 150; i++) {
        //    System.out.print(i);
        //    if (i % 3 == 0){
        //        System.out.print("\tfoo");
        //    }
        //    if (i % 5 == 0){
        //        System.out.print("\tbiz");
        //    }
        //    if (i % 7 == 0){
        //        System.out.print("\tbaz");
        //    }
        //    System.out.println();
        //}
        for (int i= 1; i <= 150;i++) {
            String str = i + "";
            str += (i% 3 == 0 ? "\tfoo": "");
            str += (i % 5 == 0 ? "\tbiz": "");
            str += (i% 7 == 0 ? "\tbaz": "");
            System.out.println(str);
        }
    }
}
