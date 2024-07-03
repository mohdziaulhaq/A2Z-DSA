package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        int n = 100;
        // patternOne(n);
        // System.out.println(reverse(n));
        // System.out.println(isPalindrome(n));
        // System.out.println(isArmstrongNumber(n));
        // printAllDivisorsOptimizedApproach(n);
        // System.out.println(sumOfDivisors(n));
        // System.out.println(sumOfDivisorsOptimized(n));

        // Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}, n = 11
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int m = 11;
        // Output: 3
        // System.out.println(minJumps(arr, m));
        List<Integer> result = printAllPrimeNumber(n);

        System.out.println(result);

    }

    static void patternOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static int reverse(int x) {
        int originalNumber = x;
        int result = 1;
        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            result = result * 10 + remainder;
            originalNumber = originalNumber / 10;
        }
        return result;
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
        int armstrongNumber = 0;
        while (originalNumber > 0) {
            numberOfDigits++;
            originalNumber /= 10;
        }
        originalNumber = n;
        for (int i = 0; i < numberOfDigits; i++) {
            int remainder = originalNumber % 10;
            int oneDigit = (int) Math.pow(remainder, numberOfDigits);
            armstrongNumber = armstrongNumber + oneDigit;
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

    static long sumOfDivisors(int n) {
        // code here
        long totalSum = 0;
        // long insideSum = 0;
        for (int i = 1; i <= n; i++) {
            long insideSum = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    insideSum = insideSum + j;
                }
            }
            totalSum = totalSum + insideSum;
        }
        return totalSum;
    }

    static long sumOfDivisorsOptimized(int N) {
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (i * (N / i));
        }
        return ans;
    }

    static int minJumps(int[] arr, int n) {
        // your code here
        int minJumps = 1;
        if (arr[0] == 0)
            return -1;
        for (int i = 1; i <= n;) {
            if (i >= arr.length - 1)
                return minJumps;
            else {

                i = i + arr[i];
                minJumps++;
            }

        }
        return minJumps;
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
