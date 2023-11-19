import java.util.*;
class Solution {
    public int solution(String t, String p) {
        List<String> list=new ArrayList<>();
        Long pp=Long.parseLong(p);
        for(int i=0;i<=t.length()-p.length();i++){
            String s=t.substring(i,i+p.length());
            if(Long.parseLong(s)<=pp)
                list.add(s);
        }
        return list.size();
    }
}