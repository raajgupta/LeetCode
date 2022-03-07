public class Solution {
    public int trap(int[] h) {
        if (h == null || h.length == 0) {
            return 0;
        }
        int[] left = new int[h.length + 1];
        left[0] = 0;
        for (int i = 0; i < h.length; i++) {
            left[i + 1] = Math.max(left[i], h[i]);
        }
        int right = 0;
        int sum = 0;
        for (int i = h.length - 1; i >= 0; i--) {
            int min = Math.min(left[i], right);
            sum += min > h[i] ? min - h[i] : 0;
            right = Math.max(h[i], right);
        }
        return sum;
    }
}
