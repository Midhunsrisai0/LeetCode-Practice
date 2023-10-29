class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int l = matrix[0][0], h = matrix[r-1][c-1];
        if(target<l || target>h) return false;
        int i=0,j=c-1;
        while(i<r && j>=0){
            if(matrix[i][j]==target) return true;
            else if(target>matrix[i][j])i++;
            else j--;
        }
        return false;
    }
}