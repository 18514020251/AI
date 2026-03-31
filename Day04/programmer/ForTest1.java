package programmer;

/**
 *  for循环
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-31 15:38
 */
public class ForTest1 {
    public static void main(String[] args) {
/*        for (;;){// 如果for没有写条件，大括号也没有流程控制语句，就是一个死循环
            System.out.println("Hello World");
        }*/
        // 这里i <5 成立时，表示循环体要执行，当i>=5，循环结束
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}
