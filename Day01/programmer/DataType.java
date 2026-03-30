package programmer;

/**
 *  数据类型
 *  long类型的字面量值，需要在数字后面加L
 *  float类型的字面量值，需要在数字后面加F
 *  单字符类型的字面量值，需要加单引号
 *  转义字符
 *  \'
 *  \"
 *  \t 横向制表符，相当于键盘的Tab键
 *  \b 空一格，相当于键盘的Back space
 *  \n 换行符
 *  \r 回车符
 *  \\
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 9:06
 */
public class DataType {
    public static void main(String[] args) {
        System.out.println(18);
        System.out.println(1800000000000L);

        float v = 3.1415926535F;
        // 单精度浮点型，大约可以表示小数点后7-8位
        double v1 = 3.1415926535;
        // 双精度浮点型，大约可以表示小数点后15位

        System.out.println(v);
        System.out.println(v1);

        System.out.println('a');
        System.out.println('中');
        System.out.println("--------------------");
        System.out.println('\'');
        System.out.println('\"');
        System.out.println('\b');
        System.out.println("Hello\rWorld");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\\World");
        System.out.println("\"HelloWorld\"");
        System.out.println('\\');
        System.out.println('\u0000');
    }

}
