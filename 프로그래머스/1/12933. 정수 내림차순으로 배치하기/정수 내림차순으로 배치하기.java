import java.util.*;
class Solution {
    public long solution(long n) {
        String s=String.valueOf(n);
        int[] arr=new int[s.length()];
        int idx=0;
        for(char c:s.toCharArray()){
            arr[idx++]=c-'0';
        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i:arr){
            sb.append(i);
        }
        String ss=sb.reverse().toString();
        return Long.parseLong(ss);
    }
}