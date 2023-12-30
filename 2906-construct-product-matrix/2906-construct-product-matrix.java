class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long[] columns = new long[n];
        long[][] pl = new long[n][m];
        int[][] p = new int[n][m];
        
        for(int i=0; i<n; i++){
            pl[i] = getProduct(grid[i], m);
            columns[i] = (pl[i][0] * (long)grid[i][0]) % 12345;
        }
        long[] columnProd = getProduct2(columns, n);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                p[i][j] = (int) ((pl[i][j] * columnProd[i]) % 12345);
            }
        }
        return p;
    }
    public long[] getProduct(int[] grid, int m){
        long[] p = new long[m];
        p[0] = 1;
        for(int i=1; i<m; i++){
            p[i] = (p[i-1] * (long) grid[i-1]) % 12345;
        }
        long R=1;
        for(int i=m-1; i>=0; i--){
            p[i] = (R*p[i]) % 12345;
            R = (R*grid[i]) % 12345;
        }
        return p;
    }
    public long[] getProduct2(long[] grid, int m){
        long[] p = new long[m];
        p[0] = 1;
        for(int i=1; i<m; i++){
            p[i] = (p[i-1] * (long) grid[i-1]) % 12345;
        }
        long R=1;
        for(int i=m-1; i>=0; i--){
            p[i] = (R*p[i]) % 12345;
            R = (R*grid[i]) % 12345;
        }
        return p;   
    }
}