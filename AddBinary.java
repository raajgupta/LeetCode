public class Solution {
    public String addBinary(String s, String a) {
        StringBuilder str = new StringBuilder();
        int i = s.length() - 1, j = a.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += s.charAt(i--) - '0';
            if (j >= 0) sum += a.charAt(j--) - '0';
            str.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) str.insert(0, carry);
        return str.toString();
    }
}