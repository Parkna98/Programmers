class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] rank=new int[score.length];
        int idx=0;
        for(int[] avg:score){
            answer[idx++]=(avg[0]+avg[1])/2.0;
        }
        for(int i=0;i<answer.length;i++){
            rank[i]=1;
            for(int j=0;j<answer.length;j++){
                if(answer[j]>answer[i])
                    rank[i]++;
            }
        }
        return rank;
    }
}