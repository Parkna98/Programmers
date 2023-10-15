class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int garo=box[0]/n;
        int sero=box[1]/n;
        int h=box[2]/n;
        answer=garo*sero*h;
        return answer;
    }
}