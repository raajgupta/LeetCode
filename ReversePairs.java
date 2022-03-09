public class Solution {

    public int reversePairs(int[] n) {
        return mergeSort(n, 0, n.length-1);
    }
    private int mergeSort(int[] n, int a, int b){
        if(a>=b) return 0;
        int mid = a + (b-a)/2;
        int count = mergeSort(n, a, mid) + mergeSort(n, mid+1, b);
        for(int i = a, j = mid+1; i<=mid; i++){
            while(j<=b && n[i]/2.0 > n[j]) j++;
            count += j-(mid+1);
        }
        Arrays.sort(n, a, b+1);
        return count;
    }
}