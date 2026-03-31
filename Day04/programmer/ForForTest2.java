package programmer;

/**
 * 循环嵌套2
 * 打印直角三角形
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 16:07
 */
public class ForForTest2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
