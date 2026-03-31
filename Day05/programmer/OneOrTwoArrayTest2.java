package programmer;

public class OneOrTwoArrayTest2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = new int[a.length];
        b[1] = 100;
        /*
        思考：这里有几个数组？有几个柜子？
        这里有2个数组变量，也有2个数组，它们指向不同一个数组
         */
        System.out.println("a数组的元素：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //1 2 3

        System.out.println();
        System.out.println("b数组的元素：");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        //0 100 0
    }
}
