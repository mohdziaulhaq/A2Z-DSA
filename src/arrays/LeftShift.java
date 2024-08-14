package src.arrays;

public class LeftShift {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        int k = 1;
        rotateleft(array, k);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void rotateleft(int[] nums, int k) {
        if (k == 0 || k == nums.length)
            return;
        int j = 0;
        int[] nums2 = new int[nums.length];
        int n = nums.length;
        k = k % n;
        for (int i = n - k; i < n; i++) {
            nums2[j++] = nums[i];
        }
        for (int i = 0; i <= k && j < n; i++) {

            nums2[j++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums2[i];
        }

    }
}
