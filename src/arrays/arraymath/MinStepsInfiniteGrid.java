package arrays.arraymath;

import java.util.ArrayList;


public class MinStepsInfiniteGrid {
/*You are in an infinite 2D grid where you can move in any of the 8 directions :

 (x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it.
You start from the first point.*/ 
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        if(X.isEmpty() || Y.isEmpty())
        return 0;
        if(X.size()!=Y.size()) 
            return 0;
         int distance =0;
         int curX=X.get(0);
         int curY=Y.get(0);
         for(int i=1;i<X.size();i++)
         {
             int nextX=X.get(i);
             int nextY=Y.get(i);
             int disX=Math.abs(curX-nextX);
             int disY=Math.abs(curY-nextY);
             distance+=Math.max(disX,disY);
             curX=nextX;
             curY=nextY;
         }
        return distance;
    }
    
}
