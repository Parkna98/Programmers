class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.trim().split(" ");
        int len=0; 
        for(String s:arr)
            if(!s.equals("")) len++;
        String[] answer=new String[len];
        int idx=0;
        for(String s:arr)
            if(!s.equals(""))
            answer[idx++]=s;
        return answer;
    }
}