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
                dfs(i,n,isVisited, isConnected);
            }
        return provinces;
    }
     void dfs(int x,int n, boolean[] isVisited, int[][] mat){
        for(int i=0;i<n;i++){
            if(mat[x][i]==1 && !isVisited[i]){
                isVisited[i]=true;
                dfs(i,n,isVisited,mat);
            }
        }
    }
}