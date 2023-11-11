class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum=0;
        for(int i=-100;i<=total;i++){
            sum=0;
            for(int j=i;j<i+num;j++){
                sum+=j;
                if(sum==total){
                    for(int k=0;k<num;k++){
                        answer[k]=i+k;
                    }
                    return answer;
                }
            }
        }
        return answer;
    }
}