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

    public String longestCommonPrefixs(String[] strs) {
        if (strs.length == 0 ) return "";
        //setting the first element in the array as prefix
        String prefix = strs[0];
        // traverse from the second element in the array til the end
        for (int i = 1 ; i < strs.length ; i++ ) {
            //while the current element.index of the prefix is not equals to zero
            while (strs[i].indexOf(prefix) != 0 ) {
                //we subtract one letter per loop. substring(0 means from the
                //first letter of the prefix, up to the last letter minus one)
                prefix = prefix.substring(0,prefix.length() - 1);
                //if prefix is empty. we return none
                if (prefix.isEmpty()) return "";
            }
        }
        //returning the prefix
        return prefix;
    }
}
