class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s=num+"";
        String n=k+"";
        if(s.indexOf(n)!=-1)
            answer=s.indexOf(n)+1;
        else answer=-1;
        return answer;
    }
}