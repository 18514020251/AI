package programmer;

public class OneOrTwoArrayTest {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a; //配了一把钥匙，与a开同一个柜子
        b[1] = 100;
        /*
        思考：这里有几个数组？有几个柜子？
        这里有2个数组变量，但是它们指向同一个数组
         */
        System.out.println("a数组的元素：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //1 100 3

        System.out.println();
        System.out.println("b数组的元素：");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        //1 100 3
    }
}
