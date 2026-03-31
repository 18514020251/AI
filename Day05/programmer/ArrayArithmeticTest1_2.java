package programmer;

public class ArrayArithmeticTest1_2 {
    public static void main(String[] args) {
        //需求：随机产生10个[0,100)的整数放到数组中，统计其中偶数的个数、3的倍数、5的倍数的个数。
        //(1)定义一个数组，长度为10，元素类型是int
        int[] arr = new int[10];

        //(2)随机产生10个[0,100]的整数放到数组中，并且输出
        //(3)统计其中偶数的个数、3的倍数、5的倍数的个数
        int evenCount = 0;
        int threeCount = 0;
        int fiveCount = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);

            System.out.print(arr[i]+" ");

            if(arr[i] % 2 == 0){
                evenCount++;
            }
            if(arr[i] % 3 == 0){
                threeCount++;
            }
            if(arr[i] % 5 == 0){
                fiveCount++;
            }
        }
        System.out.println();
        System.out.println("偶数的个数：" + evenCount);
        System.out.println("3的倍数的个数：" + threeCount);
        System.out.println("5的倍数的个数：" + fiveCount);

    }
}
