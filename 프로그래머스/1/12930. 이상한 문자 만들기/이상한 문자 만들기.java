class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isToUpper=true;
        
        for(char c:s.toCharArray()){
            if(!Character.isAlphabetic(c)){
                answer.append(c);
                isToUpper=true;
            } else {
                if(isToUpper){
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                isToUpper=!isToUpper;
            }
        }
        return answer.toString();
    }
}