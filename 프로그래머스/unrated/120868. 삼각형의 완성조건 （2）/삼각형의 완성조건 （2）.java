class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=(sides[0]>=sides[1])?sides[0]:sides[1];
        int min=(sides[0]>=sides[1])?sides[1]:sides[0];
        for(int i=1;i<max;i++){
            if(i+min>max) answer++;
        }
        for(int i=max;i<=Integer.MAX_VALUE;i++){
            if(max+min>i) answer++;
            else break;
        }
        return answer;
    }
}