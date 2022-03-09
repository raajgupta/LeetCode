public class Solution {
    public boolean searchMatrix(int[][] mtx, int n) {
        int mat = mtx.length;
        if(mat == 0) return false;
        int a = mtx[0].length;
        if(a == 0) return false;

        int x = 0, y = mat * a - 1;
        while(x <= y) {
            int mid = x + (y - x) / 2;

            int row = mid / a;
            int col = mid % a;
            if(mtx[row][col] == n) return true;
            else if(mtx[row][col] > n) y = mid - 1;
            else x = mid + 1;
        }
        return false;
    }
}