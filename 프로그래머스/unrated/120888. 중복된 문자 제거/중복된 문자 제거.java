import java.util.*;
class Solution {
    public String solution(String my_string) {
        Set<Character> used=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c:my_string.toCharArray()){
            if(used.contains(c)) continue;
            used.add(c);
            sb.append(c);
        }
        return sb.toString();
    }
}