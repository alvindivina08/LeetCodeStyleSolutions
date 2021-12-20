package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println("MCMXCV is  " + romanToInt("MCMXCV"));
        System.out.println("MCMXCV is  " + romanToIntBackApproach("MCMXCV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {


            System.out.println("====================================");
            System.out.println("LOOP: " + i);
            System.out.println("String: " + s.charAt(i));
            System.out.println("map.get: " + map.get(s.charAt(i)));


            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {


                System.out.println("if " + i + " is greater than 0 and " + map.get(s.charAt(i)) + " is greater than map.get(s.charAt(i - 1)) which is " + map.get(s.charAt(i - 1)));
                System.out.println("will be calculated as result " + result + " plus " + map.get(s.charAt(i)) + " - 2 * " + map.get(s.charAt(i - 1)));
                System.out.println("result is " + result + ", map.get(s.charAt(" + i + ")) is " + map.get(s.charAt(i)) + ", map.get(s.charAt(i - 1) is " + map.get(s.charAt(i - 1)) + ", 2 * map.get(s.charAt(i - 1) is " + 2 * map.get(s.charAt(i - 1)));


                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));


                System.out.println("after calculation, result is now " + result);
                System.out.println("after calculation, " + "s.charAt(i) is " + s.charAt(i) + " and result is now " + result);
                System.out.println("====================================");

            } else {

                System.out.println("else");
                System.out.println("result is currently " + result + ", to be calculated as " + result + " plus " + map.get(s.charAt(i)));
                System.out.println("result: " + result + " + map.get: " + map.get(s.charAt(i)));


                result += map.get(s.charAt(i));


                System.out.println("equals " + result);
                System.out.println("after calculation, " + "s.charAt(i) is " + s.charAt(i) + " and result is now " + result);
                System.out.println("====================================");
            }
        }
        return result;
    }

    public static int romanToIntBackApproach(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
