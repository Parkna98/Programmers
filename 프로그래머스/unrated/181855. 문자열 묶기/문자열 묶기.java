class Solution {
    public int solution(String[] strArr) {
        int[] max=new int[31];
        for(String s:strArr)
            max[s.length()]++;
        int answer=0;
        for(int i:max){
            if(i>answer) answer=i;
        }
        return answer;
    }
}