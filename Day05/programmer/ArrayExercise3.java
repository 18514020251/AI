package programmer;

public class ArrayExercise3 {
    public static void main(String[] args) {
        /*
        （1）用一个数组存储26个英文字母的小写形式a-z
        （2）正序遍历输出小写字母
        （3）逆序遍历输出小写字母
         */
//        char[] letters = {'a','b','c',....};
        char[] letters = new char[26];
        /*
        letters[0] 存储 'a'  等价于  (char)('a' + 0)
        letters[1] 存储 'b'  等价于  (char)('a' + 1)
        letters[2] 存储 'c'         (char)('a' + 2)
        ...

        letters[i] 存储  (char)('a' + i)
         */
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)('a'+i);
            System.out.print(letters[i]);
        }
        System.out.println();
//        System.out.println(letters);

        for(int i=letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
    }
}
