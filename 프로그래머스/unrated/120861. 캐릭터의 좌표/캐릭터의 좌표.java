class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int x=board[0]/2;
        int y=board[1]/2;
        for(String s:keyinput){
            if(s.equals("up")) answer[1]++;
            else if(s.equals("down")) answer[1]--;
            else if(s.equals("left")) answer[0]--;
            else answer[0]++;
            
            if(answer[0]<0){
            if(answer[0]<=x*(-1)) answer[0]=x*(-1);
        }
        else 
            if(answer[0]>=x) answer[0]=x;
        
        if(answer[1]<0){
            if(answer[1]<=y*(-1)) answer[1]=y*(-1);
        }
        else
            if(answer[1]>=y) answer[1]=y;
        }
        
        
            
        return answer;
    }
}