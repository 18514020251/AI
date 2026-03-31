package programmer;

public class ArrayArithmetic6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //思路一：找一个同样大小的数组，按逆序存放元素（不够好）
        int[] nums = new int[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[arr.length-1-i];
        }

        //查看两个数组的情况
        System.out.print("arr数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("nums数组：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        System.out.println("==========================");
        //让arr指向nums数组，抛弃原来的数组
        arr = nums;
        //查看两个数组的情况
        System.out.print("arr数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("nums数组：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
