import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        for(int i:arr){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                if(i==stack.peek()){
                    continue;
                }
                else{
                    stack.push(i);
                }
            }
        }
        int[] answer=new int[stack.size()];
        int idx=0;
        for(int k:stack){
            answer[idx++]=k;
        }
        return answer;
    }
}