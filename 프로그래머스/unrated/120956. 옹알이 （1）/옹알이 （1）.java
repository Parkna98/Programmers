class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s:babbling){
            if(isPossible(s)) answer++;
        }
        return answer;
    }
    public boolean isPossible(String s){
        s=s.replace("aya"," ");
        s=s.replace("ye"," ");
        s=s.replace("woo"," ");
        s=s.replace("ma"," ");
        if(s.trim().equals("")) return true;
        else return false;
    }
}