class Solution {
    public int solution(String s) {
        String num=s;
        if(s.startsWith("-")){
            num=num.substring(1,s.length());
            return Integer.parseInt(num)*(-1);
        }
        return Integer.parseInt(num);
    }
}