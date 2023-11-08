class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            if(!Character.isAlphabetic(my_string.charAt(i))){
                String s="";
                while(!Character.isAlphabetic(my_string.charAt(i))){
                    s+=my_string.charAt(i);
                    i++;
                    if(i==my_string.length()) break;
                }
                answer+=Integer.parseInt(s);
            }
        }
        return answer;
    }
}