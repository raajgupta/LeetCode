public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return ans;
        int mx = matrix.length;
        int n = matrix[0].length;
        int a = 0;
        int b =0;
        while (mx>0 && n>0){
            if (mx ==1){
                for (int i = 0; i<n; i++){
                    ans.add(matrix[a][b++]);
                }
                break;
            }
            else if(n ==1){
                for (int i = 0; i< mx; i++){
                    ans.add(matrix[a++][b]);
                }
                break;
            }

            for (int i = 0; i< n-1; i++){
                ans.add(matrix[a][b++]);
            }

            for(int i=0;i<mx-1;i++){
                ans.add(matrix[a++][b]);
            }

            for(int i=0;i<n-1;i++){
                ans.add(matrix[a][b--]);
            }

            for(int i=0;i<mx-1;i++){
                ans.add(matrix[a--][b]);
            }

            a++;
            b++;
            mx=mx-2;
            n=n-2;
        }
        return ans;
    }
}