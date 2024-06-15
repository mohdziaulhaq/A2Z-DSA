package src;

public class Debug {
    public static void main(String[] args) {
        int n = 3;
        patternOne(n);

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
