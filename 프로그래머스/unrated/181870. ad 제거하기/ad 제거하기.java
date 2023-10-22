class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int len=strArr.length;
        for(String s:strArr){
            if(s.contains("ad")) len--;
        }
        answer=new String[len];
        int idx=0;
        for(String s:strArr){
            if(!s.contains("ad")) 
                answer[idx++]=s;
        }
        return answer;
    }
}