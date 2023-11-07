class Solution {
    public int solution(int[][] dots) {
        int x_max=-256;
        int y_max=-256;
        int x_min=256;
        int y_min=256;
        for(int[] xy:dots){
            if(xy[0]>x_max) x_max=xy[0];
            if(xy[0]<x_min) x_min=xy[0];
            if(xy[1]>y_max) y_max=xy[1];
            if(xy[1]<y_min) y_min=xy[1];
        }
        return (x_max-x_min)*(y_max-y_min);
    }
}