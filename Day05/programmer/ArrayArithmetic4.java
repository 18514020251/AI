package programmer;

public class ArrayArithmetic4 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 6, 4};
        //找出最大值及其下标？

        int max = arr[0];//存储元素
        int index = 0;//存储下标
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("最大值的下标：[" + index +"]");
    }
}
