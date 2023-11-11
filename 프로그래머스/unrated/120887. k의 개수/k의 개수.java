class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder sb=new StringBuilder();
        for(int l=i;l<=j;l++){
            sb.append(String.valueOf(l));
        }
        for(int l=0;l<sb.length();l++){
            if(sb.charAt(l)==Character.forDigit(k,10))
                answer++;
        }
        return answer;
    }
}