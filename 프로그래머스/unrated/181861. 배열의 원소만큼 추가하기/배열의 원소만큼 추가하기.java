import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            for(int j=0;j<i;j++)
                list.add(i);
        }
        int idx=0;
        int[] answer=new int[list.size()];
        for(int i:list){
            answer[idx++]=i;
        }
        return answer;
    }
}