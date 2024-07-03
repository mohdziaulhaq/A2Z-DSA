package src.basicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

        // 9. Palindrome Number - https://leetcode.com/problems/palindrome-number/
        // System.out.println(isPalindrome(n));

        // Armstrong number -
        // https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
        // System.out.println(isArmstrongNumber(n));

        // printAllDivisors(n);
        // https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
        // System.out.println("\n");
        // printAllDivisorsOptimizedApproach(n);

        // https://www.geeksforgeeks.org/problems/prime-number2314/1
        // System.out.println(checkprime(n));

        // System.out.println(checkprime(n));
        printAllPrimeNumber(n).stream().forEach(item -> System.out.print(item + " "));
        // System.out.println(printAllPrimeNumber(n));
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

    static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int numberOfDigits = 0;
        double armstrongNumber = 0;
        while (originalNumber > 0) {
            numberOfDigits++;
            originalNumber /= 10;
        }
        for (int i = 0; i < numberOfDigits; i++) {
            int remainder = originalNumber % 10;
            double oneDigit = Math.pow(remainder, numberOfDigits);
            armstrongNumber = (int) armstrongNumber * 10 + oneDigit;
            originalNumber /= 10;
        }
        return armstrongNumber == n;
    }

    static void printAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    static void printAllDivisorsOptimizedApproach(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // System.out.print(i + " ");
                list.add(i);
                if ((n / i) != i)
                    list.add(n / i);
                // System.out.print(i + " ");

            }

        }
        Collections.sort(list);
        // Stream.of(list).forEach(i -> System.out.println(i));
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }

    static boolean checkprime(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i)
                    count++;
            }
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    static List<Integer> printAllPrimeNumber(int n) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    if (i / j != j)
                        count++;
                }
            }
            if (count == 2)
                primeNumbers.add(i);
        }
        return primeNumbers;
    }
}
