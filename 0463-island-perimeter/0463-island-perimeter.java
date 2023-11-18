class Solution {
    public int islandPerimeter(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int c=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    if(i==0)
                    {
                        c++;
                    }else if(grid[i-1][j]==0)
                    {
                        c++;
                    }
                    if(i==row-1)
                    {
                        c++;
                    }else if(grid[i+1][j]==0)
                    {
                        c++;
                    }
                    if(j==col-1)
                    {
                        c++;
                    }
                    else if(grid[i][j+1]==0)
                    {
                        c++;
                    }

                    if(j==0)
                    {
                        c++;
                    }else if(grid[i][j-1]==0)
                    {
                        c++;
                    }
                    
                }
            }
        }
        return c;
    }
}