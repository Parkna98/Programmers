class Solution {
    public int solution(int M, int N) {
        int w=0; int h=0;
        w=M-1; 
        h=(N-1)*M;
        return w+h;
    }
}