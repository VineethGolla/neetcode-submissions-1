class NumMatrix {
    int pf[][];

    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m= matrix[0].length;
        pf=new int[n][m];
        pf[0][0]=matrix[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    pf[j][i]=matrix[j][i];
                }else{
                    pf[j][i]=matrix[j][i]+pf[j-1][i];  
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                pf[i][j]=pf[i][j]+pf[i][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=0;
                if(row1==0 && col1==0){
                    ans=pf[row2][col2];
                }
                else if(row1==0){
                    ans=pf[row2][col2]-pf[row2][col1-1];
                }
                else if(col1==0){
                    ans=pf[row2][col2]-pf[row1-1][col2];
                }
                else{
                    ans=pf[row2][col2]-pf[row1-1][col2]-pf[row2][col1-1]+pf[row1-1][col1-1];
                }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */