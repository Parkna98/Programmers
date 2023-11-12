class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num=1;
        int x=0;int y=0;
        int direction=0;
        // 0:오른쪽,1:아래,2:왼쪽,3:위
        
        while(num<=n*n){
            answer[y][x]=num++;
            if(direction==0){
                if(x==n-1||answer[y][x+1]!=0){
                    direction=1;
                    y++;
                }
                else 
                    x++;
            }
            else if(direction==1){
                if(y==n-1||answer[y+1][x]!=0){
                    direction=2;
                    x--;
                }
                else 
                    y++;
            }
            else if(direction==2){
                if(x==0||answer[y][x-1]!=0){
                    direction=3;
                    y--;
                }
                else 
                    x--;
            }
            else if(direction==3){
                if(answer[y-1][x]!=0){
                    direction=0;
                    x++;
                }
                else
                    y--;
            }
        }
        
        return answer;
    }
}