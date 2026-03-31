package programmer;

/**
 * 循环嵌套1
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 16:06
 */
public class ForForTest1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
