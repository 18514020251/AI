package programmer;

public class ArrayArithmetic5 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 9, 4};
        //找出最大值及其下标？

        int max = arr[0];//存储元素
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);

        System.out.print("最大值的下标：");
        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                System.out.print("[" + i+"] ");
            }
        }
        System.out.println();
    }
}
