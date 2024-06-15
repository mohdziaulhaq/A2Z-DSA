package src;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternOne(n);
        sc.close();

    }

    static void patternOne(int n) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
