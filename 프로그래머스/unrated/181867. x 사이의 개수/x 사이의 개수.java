class Solution {
    public int[] solution(String myString) {
        String[] ss=myString.split("x",myString.length());
        int[] answer=new int[ss.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=ss[i].length();
        }
        
        return answer;
    }
}