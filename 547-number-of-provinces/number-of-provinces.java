class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] isVisited = new boolean[n];
        Arrays.fill(isVisited,false);
        int provinces = 0;
        for(int i=0;i<n;i++)
            if(!isVisited[i]){
                isVisited[i]=true;
                provinces++;
                dfs(i,isVisited, isConnected);
            }
        return provinces;
    }
     void dfs(int n, boolean[] isVisited, int[][] mat){
        for(int i=0;i<mat[0].length;i++){
            System.out.println(n+"--"+mat[0].length);
            if(mat[n][i]==1 && !isVisited[i]){
                isVisited[i]=true;
                dfs(i,isVisited,mat);
            }
        }
    }
}