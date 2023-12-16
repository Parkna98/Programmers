class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero=0;
        int same=0;
        for(int i:lottos){
            if(i==0)
                zero++;
            for(int j:win_nums){
                if(i==j)
                  same++;
            }
        }
        answer[0]=rank(same+zero);
        answer[1]=rank(same);
        return answer;
    }
    public int rank(int num){
        if(num==6)
            return 1;
        else if(num==5)
            return 2;
        else if(num==4)
            return 3;
        else if(num==3)
            return 4;
        else if(num==2)
            return 5;
        else
            return 6;
    }
}