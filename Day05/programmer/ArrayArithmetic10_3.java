package programmer;

public class ArrayArithmetic10_3 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};


        /*
        5个元素，需要4轮，i=0,1,2,3  i<4, i<arr.length-1
        i=0, 第1轮： j<4
        i=1, 第2轮： j<3
        i=2, 第3轮： j<2
        i=3, 第4轮： j<1
              j<arr.length-i
         */
        for(int i=0; i<arr.length-1; i++) {
            for (int j = 0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        //最终结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
