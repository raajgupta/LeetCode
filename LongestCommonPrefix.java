public class Solution {
    public String longestCommonPrefix(String[] args) {
        if (args == null || args.length == 0) {
            return "";
        }
        if (args.length == 1) {
            return args[0];
        }
        String pfx = "";
        int id = 0;
        while (id < args[0].length()) {
            char c = args[0].charAt(id);
            boolean valid = false;
            for (int i = 1; i < args.length; i++) {
                if (args[i].length() > id && args[i].charAt(id) == c) {
                    valid = true;
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                pfx += "" + c;
            } else {
                break;
            }
            id++;
        }
        return pfx;
    }
}

