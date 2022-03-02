public class Solution {
    public int threeSumClosest(int[] num, int target) {
        if ( num == null || num.length < 3){
            return Integer.MAX_VALUE;
        }

        Arrays.sort(num);

        int closest = Integer.MAX_VALUE / 2;

        for (int i = 0; i < num.length - 2; i++){
            int left = i + 1;
            int right = num.length - 1;
            while (left < right){
                int sum = num[i] + num[left] + num[right];
                if ( sum == target){
                    return sum;
                }
                else if (sum < target){
                    left++;
                }
                else{
                    right--;
                }
                closest = Math.abs(sum - target) < Math.abs(closest - target) ? sum : closest;
            }
        }
        return closest;
    }
}