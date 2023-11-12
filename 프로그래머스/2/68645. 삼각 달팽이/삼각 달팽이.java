class Solution {
    public static final int[] dx={0,1,-1};
    public static final int[] dy={1,0,-1};
    public int[] solution(int n) {
        int[][] tri=new int[n][n];
        int num=1;
        int x=0; int y=0;
        int dir=0;
        
        while(true){
            tri[y][x]=num++;
           int nx=x+dx[dir];
           int ny=y+dy[dir];
            if(nx==n||ny==n||nx==-1||ny==-1||tri[ny][nx]!=0){
                dir=(dir+1)%3;
                nx=x+dx[dir];
                ny=y+dy[dir];
                if(nx==n||ny==n||nx==-1||ny==-1||tri[ny][nx]!=0)
                    break;
            }
            x=nx;
            y=ny;
        }
        int[] result=new int[num-1];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                result[idx++]=tri[i][j];
            }
        }
        return result;
    }
}