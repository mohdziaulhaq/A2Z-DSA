package src;

public class Debug {
    public static void main(String[] args) {
        int n = 3;
        patternOne(n);

    }

    static void patternOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
