package LeetCode.Easy;

public class ReversePrefixOfWord {
    /*
     * https://leetcode.com/problems/reverse-prefix-of-word/
     * Given a 0-indexed string word and a character ch,
     * reverse the segment of word that starts at index 0 and ends at the
     * index of the first occurrence of ch (inclusive).
     * If the character ch does not exist in word, do nothing.
     *
     * For example, if word = "abcdefd" and ch = "d",
     * then you should reverse the segment that starts at 0
     * and ends at 3 (inclusive). The resulting string will be "dcbaefd".
     */
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int locate = 0;
        for (int i = 0; i < word.length(); i++) { //first occurrence of ch
            if (ch == c[i]) {
                locate = i;
                break;
            }
        }
        char[] res = new char[word.length()];
        for (int i = 0; i <= locate; i++) {
            res[i] = c[locate - i];
        }
        for (int i = locate + 1; i < word.length(); i++) {
            res[i] = c[i];
        }
        return String.valueOf(res);
    }
}
