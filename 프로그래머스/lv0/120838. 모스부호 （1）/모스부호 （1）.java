class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] let=letter.split(" ");
        String[] mos={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String l:let){
            for(int i=0;i<mos.length;i++){
                if(l.equals(mos[i])){
                    answer+=(char)(i+97);
                }
            }
        } 
        return answer;
    }
}