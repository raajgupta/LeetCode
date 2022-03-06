class Solution {
    public void moveZeroes(int[] n) {
        int id=0;
        for(int i=0;i<n.length;i++) {
            if(n[i]!=0) {
                n[id++]=n[i];
            }
        }
        for(int i=id;i<n.length;i++)
            n[i]=0;
    }
}