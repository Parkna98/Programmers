class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        String revAnswer ="";
        for(int i=numLog.length-1;i>=1;i--){
            switch(numLog[i]-numLog[i-1]){
                case 1:revAnswer+="w";
                    break;
                case -1:revAnswer+="s";
                    break;
                case 10:revAnswer+="d";
                    break;
                case -10:revAnswer+="a";
                    break;
            }
        }
        for(int i=revAnswer.length()-1;i>=0;i--)
            answer+=revAnswer.charAt(i);
        return answer;
    }
}