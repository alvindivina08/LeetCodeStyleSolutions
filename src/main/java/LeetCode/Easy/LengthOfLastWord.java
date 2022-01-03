package LeetCode.Easy;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = "Welcome to the mooooooon             ";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int len=s.length(), lastLength=0;

        //this is to handle the space at the very end of the sentence
        while(len > 0 && s.charAt(len-1)==' '){
            len--;
        }

        //  when the space is gone. we start counting the length of the last word.
        while(len > 0 && s.charAt(len-1)!=' '){
            lastLength++;
            len--;
        }

        return lastLength;

    }
}
