package programmer;

public class ArrayExercise1 {
    public static void main(String[] args) {
        //随机产生5个[0,100)的偶数放到数组中 ，并遍历输出
        //思路一：确保产生的就是[0,100)的偶数，一共产生5次
        /*
            Math.random()*50  得到[0,50)的小数
            (int)(Math.random()*50)  得到[0,50)的整数，可能是奇数可能是偶数
            (int)(Math.random()*50) * 2  得到[0,100)的偶数
         */
        int[] nums = new int[5];

        /*for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*50) * 2;
            System.out.print(nums[i]+" ");
        }*/

        //思路二：产生的可能是奇数可能是偶数，当产生的是偶数时，放到元素中，产生的是奇数时，抛弃，重新产生，可能产生>5次
/*        for (int i = 0; i < nums.length; ) {
            int temp = (int)(Math.random()*100);
            if(temp % 2 == 0){
               nums[i] = temp;
                i++;
            }
        }*/
        for (int i = 0; i < nums.length; i++) {
            int temp = (int)(Math.random()*100);
            if(temp % 2 == 0){
                nums[i] = temp;
            }else{
                i--;
            }
        }

    }
}
