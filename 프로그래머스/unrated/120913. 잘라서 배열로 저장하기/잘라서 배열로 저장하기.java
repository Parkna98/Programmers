class Solution {
    public String[] solution(String my_str, int n) {
        int len=my_str.length();
        String[] answer=new String[(len%n==0)?len/n:len/n+1];
        int idx=0;
        for(int i=0;i<answer.length;i++){
            if(idx+n>len)
                answer[i]=my_str.substring(idx,len);
            else
                answer[i]=my_str.substring(idx,idx+n);
            idx=idx+n;
        }
        return answer;
    }
}