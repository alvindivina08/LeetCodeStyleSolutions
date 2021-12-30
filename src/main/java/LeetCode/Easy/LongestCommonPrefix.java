package LeetCode.Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 ) return "";
        String prefix = strs[0];
        for (int i = 1 ; i < strs.length ; i++ ) {
            System.out.println(strs[i]);
            while (strs[i].indexOf(prefix) != 0 ) {
                System.out.println(prefix);
                prefix = prefix.substring(0,prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
