import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s=my_string.toLowerCase();
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for(char c:ch)
            answer+=c;
        return answer;
    }
}