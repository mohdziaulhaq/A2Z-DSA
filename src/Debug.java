package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Debug {
    public static void main(String[] args) {
        int n = 5;

        // patternOne(n);
        // System.out.println(reverse(n));
        // System.out.println(isPalindrome(n));
        // System.out.println(isArmstrongNumber(n));
        // printAllDivisorsOptimizedApproach(n);
        // System.out.println(sumOfDivisors(n));
        // System.out.println(sumOfDivisorsOptimized(n));

        // Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}, n = 11
        // int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        // int m = 11;
        // Output: 3
        // System.out.println(minJumps(arr, m));
        // List<Integer> result = printAllPrimeNumber(n);

        // System.out.println(result);

        // System.out.println(sumOfSeries(n));

        // int arr[] = { 5, 4, 3, 2, 1 };
        // reverseArrayUsingRecursion(arr, 0, n);

        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i] + " ");
        // }

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

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

    static long sumOfSeries(long n) {
        // code here
        long result = 0;
        if (n == 0)
            return 0;
        result = (long) Math.pow(n, 3);
        return result + sumOfSeries(n - 1);
    }

    // Two pointer Approach
    static void reverseArrayUsingRecursion(int arr[], int start, int end) {
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayUsingRecursion(arr, start + 1, end - 1);
    }

    // single pointer
    static void reverseArray(int arr[], int z) {
        int n = arr.length;
        if (z >= n / 2)
            return;
        int temp = arr[z];
        arr[z] = arr[n - z - 1];
        arr[n - z - 1] = temp;
        reverseArray(arr, z + 1);
    }

    // taking too much time
    static boolean isPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int n = s.length();
        while (i <= n / 2) {
            if (s.toCharArray()[i] != s.toCharArray()[n - i - 1])
                return false;
            i++;
        }
        return true;
    }

    // optimize approach
    static boolean isPalindromeOptimized(String str){
        
    }
}
