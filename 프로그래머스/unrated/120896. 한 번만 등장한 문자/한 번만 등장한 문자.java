import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] srr=s.split("");
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)))
                srr[i]="";
        }
        Arrays.sort(srr);
        answer=String.join("",srr);
        return answer;
    }
}