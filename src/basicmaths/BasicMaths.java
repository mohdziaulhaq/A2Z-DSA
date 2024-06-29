package src.basicmaths;

import java.util.Scanner;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("\nNo of Digits: " + extractDigits(n));

        // Evenly Divides - https://www.geeksforgeeks.org/problems/count-digits5716/1
        // System.out.println(evenlyDivides(n));

        // 7. Reverse Integer - https://leetcode.com/problems/reverse-integer/
        // need to handle negative values as well
        // System.out.println(reverse(n));

        System.out.println(isPalindrome(n));
        sc.close();
    }

    static int extractDigits(int N) {
        int lastDigit = Integer.MAX_VALUE;
        int counter = 0;
        while (N > 0) {
            lastDigit = N % 10;
            System.out.print(lastDigit + " ");
            counter++;
            N = N / 10;
        }
        return counter;
    }

    static int evenlyDivides(int N) {
        // code here
        int originalNumber = N;
        int count = 0;
        while (N > 0) {
            int lastDigit = N % 10;
            if (lastDigit != 0 && originalNumber % lastDigit == 0)
                count++;
            N = N / 10;
        }
        return count;
    }

    static int reverse(int x) {
        boolean isNegative = x < 0;

        int originalNumber = Math.abs(x);
        int result = 0;

        while (originalNumber > 0) {
            if (Integer.MAX_VALUE / 10 < result)
                return 0;
            int remainder = originalNumber % 10;
            result = result * 10 + remainder;
            originalNumber = originalNumber / 10;

        }
        return isNegative ? -result : result;
    }

    static boolean isPalindrome(int x) {
        int originalNumber = x;
        int reverse = 0;
        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            reverse = reverse * 10 + remainder;
            originalNumber /= 10;
        }
        if (reverse == x)
            return true;
        else
            return false;
    }
}
