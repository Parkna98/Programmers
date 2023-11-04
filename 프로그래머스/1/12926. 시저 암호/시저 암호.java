class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c:s.toCharArray()){
            answer+=push(c,n);
        }
        return answer;
    }
    private char push(char c, int n){
        if(!Character.isAlphabetic(c)) return c;
        char offset=(Character.isUpperCase(c))?'A':'a';
        int position=c-offset;
        position=(position+n)%26;
        char result=(char)(position+offset);
        return result;
    }
}