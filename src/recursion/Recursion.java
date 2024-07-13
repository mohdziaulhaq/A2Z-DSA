package src.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // reverseArrayUsingRecursionTWOPOINTER(arr, 0, n - 1);
        reverseArray(arr, 0);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // System.out.println(new Solution().sumOfSeries(n));
        // printNto1UsingBacktracking(1, n);
        // System.out.println(factorial(n));

        // https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%5B%5D=-1&page=1&query=problemTypefunctionaldifficulty%5B%5D-1page1
        // ArrayList<Long> result = findAllFactorialNumbersLessThanN(n);
        // result.forEach(e -> System.out.print(e + " "));
        sc.close();
    }

    static void printNto1UsingBacktracking(int i, int N) {
        if (i > N) {
            return;
        }
        // System.out.print(i + " ");
        printNto1UsingBacktracking(i + 1, N);
        System.out.print(i + " ");
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    static ArrayList<Long> findAllFactorialNumbersLessThanN(long n) {

        ArrayList<Long> factorials = new ArrayList<>();
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial <= n)
                factorials.add(factorial);
            else
                break;
        }
        return factorials;
    }

    // Two pointer Approach
    static void reverseArrayUsingRecursionTWOPOINTER(int arr[], int start, int end) {
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayUsingRecursionTWOPOINTER(arr, start, end);
    }

    // Single Pointer Approach
    static void reverseArray(int arr[], int z) {
        int n = arr.length;
        if (z >= n / 2)
            return;
        int temp = arr[z];
        arr[z] = arr[n - z - 1];
        arr[n - z - 1] = temp;
        reverseArray(arr, z + 1);
    }
}

class Solution {
    long sum = 0;
    int count = 1;

    long sumOfSeries(long n) {
        // code here
        long result = 0;
        if (n != 0)

            result = (long) Math.pow(n, 3);
        return result + sumOfSeries(n - 1);
    }
}