class Solution {
    public int deleteAndEarn(int[] n) {
        int l = n.length;
        if(l == 0) return 0;
        int max = 0;
        for(int num : n){
            max = Math.max(max, num);
        }
        int[] a = new int[max + 1];
        for(int num : n)
            a[num]++;
        int[] dp = new int[max + 1];
        for(int i = 1; i < dp.length; i++){
            dp[i] = Math.max(dp[i - 1], (i > 1 ? dp[i - 2]: 0) + i * a[i]);
        }
        return dp[max];
    }
}