package programmer;

/**
 * 标签
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 16:17
 */
public class LableTest  {
    public static void main(String[] args) {
        a: for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                break a;
            }
        }
    }
}
