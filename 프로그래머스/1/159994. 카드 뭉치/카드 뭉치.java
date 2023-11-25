import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> q1=new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2=new LinkedList<>(Arrays.asList(cards2));
        Queue<String> g=new LinkedList<>(Arrays.asList(goal));
        for(int i=0;i<goal.length;i++){
            if(g.peek().equals(q1.peek())){
                g.poll();
                q1.poll();
            }
            else if(g.peek().equals(q2.peek())){
                g.poll();
                q2.poll();
            }
            else return "No";
        }
        return answer;
    }
}