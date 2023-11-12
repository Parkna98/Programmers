import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        boolean bCheck=true;
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            bCheck=true;
            for(int j:delete_list){
                if(i==j) bCheck=false;
            }
            if(bCheck)
                list.add(i);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}