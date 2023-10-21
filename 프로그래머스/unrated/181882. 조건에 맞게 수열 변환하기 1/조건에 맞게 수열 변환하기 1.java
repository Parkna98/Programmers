class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int idx=0;
        for(int i:arr){
            if(i>=50 && i%2==0){
                answer[idx++]=i/2;
            }
            else if(i<50 && i%2!=0)
                answer[idx++]=i*2;
            else answer[idx++]=i;
        }
        return answer;
    }
}