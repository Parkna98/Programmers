import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num=n+"";
        for(char c:num.toCharArray()){
            answer+=c-'0';
        }

        return answer;
    }
}