class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long ll=1;ll<=n;ll++){
                if(ll*ll==n){
                    answer=ll;
                    return (answer+1)*(answer+1);
                }
        }
        return answer;
    }
}