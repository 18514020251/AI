package programmer;

public class ArrayArithmetic10 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};

        //第1轮：比较4次  j=0,1,2,3
        /*
        arr[0]与arr[1]
        arr[1]与arr[2]
        arr[2]与arr[3]
        arr[3]与arr[4]
        arr[j] 与 arr[j+1]
         */
        for(int j=0; j<4; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        //第二轮：比较3次， j=0,1,2
        /*
        arr[0]与arr[1]
        arr[1]与arr[2]
        arr[2]与arr[3]
        arr[j] 与 arr[j+1]
         */
        for(int j=0; j<3; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        //第三轮：比较2次， j=0,1
        /*
        arr[0]与arr[1]
        arr[1]与arr[2]
        arr[j] 与 arr[j+1]
         */
        for(int j=0; j<2; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        //第四轮：比较1次， j=0
        /*
        arr[0]与arr[1]
        arr[j] 与 arr[j+1]
         */
        for(int j=0; j<1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        //最终结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
