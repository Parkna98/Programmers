import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb=new StringBuilder();
        boolean isToUpper = true;
        for(char c:s.toCharArray()){
            if(!Character.isAlphabetic(c)){
                isToUpper=true;
                sb.append(c);
            }
            else{
                if(isToUpper)
                    sb.append(Character.toUpperCase(c));
                else{
                    sb.append(Character.toLowerCase(c));
                }
                isToUpper=!isToUpper;
            }
        }
        return sb.toString();
    }
}