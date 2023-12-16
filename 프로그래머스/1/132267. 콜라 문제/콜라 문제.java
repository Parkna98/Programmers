class Solution {
    
    static int answer=0;
    public int solution(int a, int b, int n) {
        if(n<a)
            return answer;
        answer+=(n/a)*b;
        n=n%a+(n/a)*b;
        return solution(a,b,n);
    }
}