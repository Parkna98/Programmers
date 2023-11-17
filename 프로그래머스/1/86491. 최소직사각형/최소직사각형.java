import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        List<Integer> maxlist=new ArrayList<>();
        List<Integer> minlist=new ArrayList<>();
        for(int[] arr:sizes){
            maxlist.add(Math.max(arr[0],arr[1]));
            minlist.add(Math.min(arr[0],arr[1]));
        }
        int mx=0;
        int mn=0;
        for(int i:maxlist){
            if(i>mx) mx=i;
        }
        for(int j:minlist){
            if(j>mn) mn=j;
        }
        return mx*mn;
    }
}