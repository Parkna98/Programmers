class Solution {
    public int[] solution(long n) {
        String s=String.valueOf(n);
        String rev=new StringBuilder(s).reverse().toString();
        char[] arr=rev.toCharArray();
        int[] answer=new int[arr.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=arr[i]-'0';
        }
        return answer;
    }
}