class Solution {
    public void setZeroes(int[][] matrix) {
        // int i=0; int j=0;
        // for(; i<matrix.length; i++){
        //     for(; j<matrix[0].length; j++){
        //         if(matrix[i][j]==0){
        //             row[i];
        //             col[j];
        //         }
        //     }
        // }
        
        
        
        
        
        boolean fr = false,fc = false;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0) {
                if(i == 0) fr = true;
                if(j == 0) fc = true;
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }
    for(int i = 1; i < matrix.length; i++) {
        for(int j = 1; j < matrix[0].length; j++) {
            if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
        }}
    }
    if(fr) {
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
        }
    }
    if(fc) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
        
        // int row = new int[n];
        // int col = new int[m];
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         if(matrix[i][j]==0){
        //             row[i]=1;
        //             col[j]=1;
        //         }
        //     }
        // }
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         if(row[i]==1||col[j]==1){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
        // return matrix[n][m];
    }
    
    
    
    // public static row(i){
    //     for(j = 0;j<matrix[0].length; j++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-1;
    //         }
    //     }
    // }
    // public static col(j){
    //     for(i = 0;j<matrix.length; i++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-1;
    //         }
    //     }
    // }
}