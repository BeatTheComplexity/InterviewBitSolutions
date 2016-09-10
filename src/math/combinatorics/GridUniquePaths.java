package math.combinatorics;

public class GridUniquePaths {
    
    /*
        A robot is located at the top-left corner of an A x B grid 
        (marked ‘Start’ in the diagram below).
    
        The robot can only move either down or right at any point in time. 
        The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).

        How many possible unique paths are there?

        Note: A and B will be such that the resulting answer fits 
        in a 32 bit signed integer.
    
        Example :   
    
        Input : A = 2, B = 2
        Output : 2

        2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
                       OR  : (0, 0) -> (1, 0) -> (1, 1)  
    */
    
    public static int uniquePaths(int a, int b){
        if(a== 0 || b==0) return 0;
        if(a==1 || b==1) return 1;
        
        int [][]arr = new int[a][b];
        
        for(int i = 0; i <a; i++){
            arr[i][0] = 1;
        }
        
        for (int j = 0;j <b;j++){
            arr[0][j] = 1;
        }
        
        for (int i = 1; i <a ; i++){
            for (int j = 1; j <b; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        
        return arr[a-1][b-1];
    }
    
}
