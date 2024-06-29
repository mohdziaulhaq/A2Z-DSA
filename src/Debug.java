package src;

public class Debug {
    public static void main(String[] args) {
        int n = 153;
        // patternOne(n);
        // System.out.println(reverse(n));
        // System.out.println(isPalindrome(n));
        System.out.println(isArmstrongNumber(n));

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
}
