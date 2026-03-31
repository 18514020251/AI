package programmer;

public class ArrayArithmetic5_2 {
    public static void main(String[] args) {
        int[] arr = {9, 9, 5, 9, 4};
        //找出最大值及其下标？

        int max = arr[0];//存储元素
        String index = "0";
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i +"";
            }else if(arr[i] == max){
                index += "," + i;
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("最大值的下标：" + index);

    }
}
