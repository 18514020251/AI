package programmer;

/**
 *  输出二十六个英文字母
 * */
public class Exam1{
    public static void main(String[] args){
        //使用循环输出小写的26个英文字母，输出语句System.out.println();
        for(char letter='a'; letter<='z'; letter++){
            System.out.println(letter);
        }

        System.out.println("=================");
        for(int i=97; i<97+26; i++){
            System.out.println((char)i);
        }

        System.out.println("=================");
        for(int i=0; i<26; i++){
            System.out.println((char)(i+'a'));
        }
    }
}
