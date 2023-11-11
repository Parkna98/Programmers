import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bc=before.toCharArray();
        char[] ac=after.toCharArray();
        Arrays.sort(bc);
        Arrays.sort(ac);
        String b=String.valueOf(bc);
        String a=String.valueOf(ac);
        if(b.equals(a))
            return 1;
        return answer;
    }
}