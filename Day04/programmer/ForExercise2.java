package programmer;

/**
 * 习题:水仙花数
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 15:49
 */
public class ForExercise2 {
    public static void main(String[] args) {
        //2、所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        //例如:
        //153 = 1*1*1 +5*5*5 + 3*3*3，找出所有的水仙花数，并统计他们有几个。
        int count = 0;
        for (int i = 100; i < 1000; i++){
            int bai = i / 100;
            int shi = i / 10 % 10;
            int ge = i % 10;
/*            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i){
                System.out.println("i = " + i);
                count++;
            }*/
            if (Math.pow(bai , 3) + Math.pow(shi , 3) + Math.pow(ge , 3) == i){
                System.out.println("i = " + i);
                count++;
            }
        }
        System.out.println("水仙花数有：" + count + "个");
    }
}
