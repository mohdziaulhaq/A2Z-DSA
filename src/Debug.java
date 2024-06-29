package src;

public class Debug {
    public static void main(String[] args) {
        int n = 121;
        // patternOne(n);
        // System.out.println(reverse(n));
        System.out.println(isPalindrome(n));

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
}
