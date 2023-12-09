import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            if(i%divisor==0)
                list.add(i);
        }
        if(list.isEmpty()){
            int[] ans=new int[] {-1};
            return ans;
        }
        int[] answer= new int[list.size()];
        int count=0;
        for(int i:list){
            answer[count++]=i;
        }
        Arrays.sort(answer);
        return answer;
    }
}