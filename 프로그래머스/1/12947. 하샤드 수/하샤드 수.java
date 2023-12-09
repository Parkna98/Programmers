class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String num=x+"";
        int sum=0;
        for(char c:num.toCharArray()){
            sum+=c-'0';
        }
        if(x%sum==0) return true;
        return answer;
    }
}