class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int m=matrix.length, n=matrix[0].length;
        int m1[]=new int[m];
        int m2[]=new int[n];
        for(int i=0; i<m; i++)
        {
            m1[i]=0;
        }
        for(int j=0; j<n; j++)
        {
            m2[j]=0;
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j]==0)
                {
                    m1[i]=1;
                    m2[j]=1;
                }
            }
        }
        for(int i=0; i<m; i++)        
        {
            if(m1[i]==1)
            {
                for(int j=0; j<n; j++)
                    matrix[i][j]=0;
            }
        }
        for(int j=0; j<n; j++)        
        {
            if(m2[j]==1)
            {
                for(int i=0;i<m; i++)
                    matrix[i][j]=0;
            }
        }
    }
}