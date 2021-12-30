package HackerRank.Easy;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        String a;
        while (scanner.hasNext()){
            a = scanner.nextLine();
            System.out.println(n + " " + a);
            n++;
        }
    }
}
