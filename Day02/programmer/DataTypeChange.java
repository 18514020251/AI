package programmer;

/**
 *  基本数据类型转换
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 11:07
 */
public class DataTypeChange {
    public static void main(String[] args) {
        int num = 'a';
        // 左边num是int类型
        // 右边'a'是char类型
        // char < int
        System.out.println("num = " + num);

        double d = 5;
        // 左边d是double类型
        // 右边5是int类型
        // int > double
        System.out.println("d = " + d);

        System.out.println('a' + 5 + 5.6F + 9.1D);
    }
}
