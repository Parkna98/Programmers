import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list=new ArrayList<>();
        for(String s:myStr.split("a|b|c")){
            if(!s.isEmpty())
                list.add(s);
        }
        if(list.size()==0) return new String[]{"EMPTY"};
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}