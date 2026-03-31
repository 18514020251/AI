package programmer;

public class ArrayArithmetic11 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};

        //第1轮：所有元素 arr[1],arr[2],arr[3],arr[4] 都与arr[0]比较
        for(int j=1; j<arr.length; j++){
            if(arr[j]<arr[0]){
                int temp = arr[0];
                arr[0] = arr[j];
                arr[j] = temp;
            }
        }

        //第2轮：所有元素 arr[2],arr[3],arr[4] 都与arr[1]比较 ， arr[0]不参与
        for(int j=2; j<arr.length; j++){
            if(arr[j]<arr[1]){
                int temp = arr[1];
                arr[1] = arr[j];
                arr[j] = temp;
            }
        }

        //第3轮：所有元素 arr[3],arr[4] 都与arr[2]比较 ， arr[0],arr[1]不参与
        for(int j=3; j<arr.length; j++){
            if(arr[j]<arr[2]){
                int temp = arr[2];
                arr[2] = arr[j];
                arr[j] = temp;
            }
        }

        //第4轮：所有元素 arr[4] 都与arr[3]比较 ， arr[0],arr[1],arr[2]不参与
        for(int j=4; j<arr.length; j++){
            if(arr[j]<arr[3]){
                int temp = arr[3];
                arr[3] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("排序结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
