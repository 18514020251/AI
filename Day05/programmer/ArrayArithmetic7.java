package programmer;

public class ArrayArithmetic7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //思路二：首尾对应位置交换
        /*for(int left=0,right=arr.length-1; left<right; left++,right--){
            //arr[left]  与 arr[right] 交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }*/
        for(int i=0; i<arr.length/2; i++){
            //arr[i] 与 arr[arr.length-1-i]
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]= temp;
        }


        //查看两个数组的情况
        System.out.print("arr数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
