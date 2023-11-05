import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int b=commands[i][0];
            int e=commands[i][1];
            int k=commands[i][2];
            int[] arr=Arrays.copyOfRange(array,b-1,e);
            Arrays.sort(arr);
            answer[i]=arr[k-1];
        }
        return answer;
    }
}