class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < mat.length) {
            sum += mat[i][mat.length - 1 - i];
            sum += mat[i++][j++];
        }

        if( mat.length % 2 == 1){
            return sum - mat[mat.length / 2][mat.length / 2];
        } 
        return sum;
    }
}