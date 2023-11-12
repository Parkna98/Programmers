import java.util.*;
class Solution {
    public int[] solution(int[] arr, int n) {
        List<Integer> list=new ArrayList<>();
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
                if(i%2==0) list.add(arr[i]);
                else list.add(arr[i]+n);
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(i%2==0) list.add(arr[i]+n);
                else list.add(arr[i]);
            }
        }
        int[] answer=list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}