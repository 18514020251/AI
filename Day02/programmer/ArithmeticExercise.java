package programmer;

/**
 *  算术运算符1
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 11:28
 */
public class ArithmeticExercise {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int k = i++ * ++i * j++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
