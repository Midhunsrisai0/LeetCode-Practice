class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] r = new int[n-2][n-2];
        for(int i=0;i<n-2;i++) for(int j=0;j<n-2;j++) r[i][j]= Max(grid,i,j);
        return r;
    }
    public int Max(int arr[][], int a, int b){
        int max=0;
        for(int i=a;i<a+3;i++) for(int j=b;j<b+3;j++) if(arr[i][j]>max) max = arr[i][j];
        return max;
    }
}