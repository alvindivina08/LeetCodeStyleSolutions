package LeetCode.Medium;

import java.util.*;

public class RemoveDuplicateLetters {

    public static void main (String[]  args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
        System.out.println(approachTwo(s));
        System.out.println(removeDuplicateLettersStack(s));
    }

    public static String removeDuplicateLetters(String s) {
        int[] cnt = new int[26];
        int pos = 0; // the position for the smallest s[i]
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) pos = i;
            if (--cnt[s.charAt(i) - 'a'] == 0) break;
        }
        return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
    }

    public static StringBuilder approachTwo(String s) {
        StringBuilder appTwo = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length() ; i++ ) {
            set.add(s.charAt(i));
        }
        for (Character c : set){
            appTwo.append(c);
        }
        return appTwo;
    }

    public static String removeDuplicateLettersStack(String sr) {

        int[] res = new int[26]; //will contain number of occurrences of character (i+'a')
        boolean[] visited = new boolean[26]; //will contain if character (i+'a') is present in current result Stack
        char[] ch = sr.toCharArray();
        for(char c: ch){  //count number of occurrences of character
            res[c-'a']++;
        }
        Stack<Character> st = new Stack<>(); // answer stack
        int index;
        for(char s:ch){
            index= s-'a';
            res[index]--;   //decrement number of characters remaining in the string to be analysed
            if(visited[index]) //if character is already present in stack, don't bother
                continue;
            //if current character is smaller than last character in stack which occurs later in the string again
            //it can be removed and  added later e.g. stack = bc remaining string abc then a can pop b and then c
            while(!st.isEmpty() && s<st.peek() && res[st.peek()-'a']!=0){
                visited[st.pop()-'a']=false;
            }
            st.push(s); //add current character and mark it as visited
            visited[index]=true;
        }

        StringBuilder sb = new StringBuilder();
        //pop character from stack and build answer string from back
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }

}
