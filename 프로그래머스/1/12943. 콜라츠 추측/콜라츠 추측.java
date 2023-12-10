class Solution {
    public int solution(int num) {
        long n=num;
        int answer = 0;
        while(n!=1){
            if(answer>500) return -1;
            if(n%2==0)
                n=n/2;
            else if(n%2!=0)
                n=(3*n)+1;
            answer++;
        }
        
        return answer;
    }
}