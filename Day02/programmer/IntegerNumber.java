package programmer;

import java.math.BigInteger;

/**
 *
 *  整数类型
 *
 * @author Programmer
 * @version 1.0
 * @date 2026-03-30 11:00
 */
public class IntegerNumber {
    public static void main(String[] args) {
        byte b1 = 127;
        //byte b2 = 128;
        short s1 = 32767;
        //short s2 = 32768;
        int i1 = 2147483647;
        //int i2 = 2147483648;
        long l1 = 9223372036854775807L;
        //long l2 = 9223372036854775808L;
        BigInteger bi1 = new BigInteger("9223372036854775807");
        BigInteger bi2 = new BigInteger("9223372036854775807");
        System.out.println(bi1.add(bi2));
    }
}
