package programmer;

/**
 * 数组练习1
 * */
public class ArrayTest1 {
    public static void main(String[] args) {
        //例如：存储第1组8个人的成绩
        /*int s1 = 89;
        int s2 = 85;
        int s3 = 100;
        int s4 = 96;
        int s5 = 75;
        int s6 = 53;
        int s7 = 60;
        int s8 = 78;*/
        //求它们的总分，平均分，最高分，最低分，排序

        //int[]代表的是数组类型，它是一组数据
        int[] scores = {89, 85, 100, 96, 75, 53, 60, 78};
        /*System.out.println("第1个同学的成绩：" + scores[0]);
        System.out.println("第2个同学的成绩：" + scores[1]);
        System.out.println("第3个同学的成绩：" + scores[2]);*/

        //数组的遍历
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i+1) + "个同学的成绩：" + scores[i]);
        }
    }
}
