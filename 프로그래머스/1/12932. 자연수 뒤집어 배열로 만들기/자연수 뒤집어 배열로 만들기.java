import java.util.*;

class Solution {
    public int[] solution(long n) {
        String s=(new StringBuffer(String.valueOf(n)).reverse()).toString();
        int[] answer = new int[s.length()];
        int index=0;
        for(char c: s.toCharArray()){
            answer[index++]=c-'0';
        }
        return answer;
    }
}