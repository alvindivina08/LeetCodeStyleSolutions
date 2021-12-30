package HackerRank.Easy;

import java.util.Scanner;

public class JavaLoopsII {


//    https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0 ; j < n ; j++) {
                System.out.print(a+=b);
                System.out.print(" ");
                b = b * 2;
            }
            System.out.println();
        }
        in.close();
    }
}
