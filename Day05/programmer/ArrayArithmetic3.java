package programmer;

public class ArrayArithmetic3 {
    public static void main(String[] args) {
        //需求：随机产生10个[0,100）的整数放到数组中，找出最大值和最小值
        //(1)定义长度为10的数组
        int[] arr = new int[10];

        //(2)随机产生10个[0,100）的整数放到数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        //(3)找出最大值和最小值
        //擂台赛
        int max = arr[0];//第一个人先上擂台
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
