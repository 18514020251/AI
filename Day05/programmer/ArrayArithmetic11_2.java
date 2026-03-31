package programmer;

public class ArrayArithmetic11_2 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};

        //第1轮：所有元素 arr[1],arr[2],arr[3],arr[4] 都与arr[0]比较
        //第2轮：所有元素 arr[2],arr[3],arr[4] 都与arr[1]比较 ， arr[0]不参与
        //第3轮：所有元素 arr[3],arr[4] 都与arr[2]比较 ， arr[0],arr[1]不参与
        //第4轮：所有元素 arr[4] 都与arr[3]比较 ， arr[0],arr[1],arr[2]不参与
        /*
        i=1,2,3,4 一共四轮
        第1轮i=1,  j=1; j<arr.length;  所有元素与arr[0]
        第2轮i=2,  j=2; j<arr.length;   所有元素与arr[1]
        第3轮i=3,  j=3; j<arr.length;  所有元素与arr[2]
        第4轮i=4,  j=4; j<arr.length; 所有元素与arr[3]
                  j=i; j<arr.length;  所有元素与arr[i-1]
         */
        for(int i=1; i<arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i-1]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("排序结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
