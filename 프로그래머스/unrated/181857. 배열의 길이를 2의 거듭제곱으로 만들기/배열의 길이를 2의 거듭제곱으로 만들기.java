import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int len=arr.length;
        for(int i=0;i<10;i++){
            if(len==Math.pow(2,i))
                len=len;
            else if(len>Math.pow(2,i) && len<Math.pow(2,i+1)){
                len=(int)Math.pow(2,i+1);
                break;
            }
        }
        for(int i=0;i<len;i++){
            if(i<arr.length) list.add(arr[i]);
            else list.add(0);
        }
        int[] answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}