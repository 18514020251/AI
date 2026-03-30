package programmer;

/**
 *  创建变量
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 9:22
 */
public class VariableExercise {
    public static void main(String[] args) {
        // 定义一组变量，存储我的个人信息、年龄、性别、体重、是否已婚等
        String name = "小昭姐姐";
        int age = 18;
        char gender = '女';
        double weight = 45.5D;
        boolean isMarried = false;

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(weight);
        System.out.println(isMarried);

        // + 表示拼接，把一个字符串和另一个字符串拼接到一起输出
        System.out.println("姓名:" + name);
        System.out.println("name:" + name); // 在""里的会原样现实，这是字面量值
        System.out.println("年龄:" + age);
    }
}
