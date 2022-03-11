public class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for (int i=0;i<s.length();i++) {
            int l1 = expandCenter(s, i, i);
            int l2 = expandCenter(s, i, i+1);

            int n = Math.max(l1, l2);
            if (n > end - start + 1) {
                start = i - (n - 1)/2;
                end = i + n/2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int expandCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}