package LeetCode.Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reverted = 0;

        while (x > reverted) {

            System.out.println("x is " + x);
            System.out.println("reverted is " + reverted);

            //we get the last number
            int pop = x % 10;
            System.out.println("pop is " + pop);

            // we get the first 2 number
            x /= 10;
            System.out.println("x divided by 10 is " + x);

            System.out.println("calculation is " + reverted + " * 10 is equals " + reverted * 10);
            reverted = (reverted * 10) + pop;

            System.out.println("after calculation, reverted is now " + reverted);
            System.out.println("============================");
        }


        System.out.println("after while block, x is now " + x);
        System.out.println("after while block, reverted is now " + reverted);
        System.out.println("after while block, reverted divided by 10 is now " + reverted / 10);

        if (x == reverted || x == reverted / 10) {
            return true;
        } else {
            return false;
        }
    }
}
