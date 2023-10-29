class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char c:s.toCharArray()){
            answer.append(push(c,n));
        }
        
        return answer.toString();
    }
    
    private char push(char c, int n){
        if(!Character.isAlphabetic(c)) return c;
        char offset = Character.isUpperCase(c)?'A':'a';
        int position = c-offset;
        position = (position + n)%26;
        return (char)(offset+position);
    }
}