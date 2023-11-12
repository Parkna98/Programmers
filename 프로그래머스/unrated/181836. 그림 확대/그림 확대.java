import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        for(int i=0;i<picture.length;i++){
            sb=new StringBuilder();
            for(char c:picture[i].toCharArray()){
                for(int j=0;j<k;j++)
                    sb.append(c);
            }
            picture[i]=sb.toString();
        }
        for(int i=0;i<picture.length;i++){
            for(int j=0;j<k;j++){
                list.add(picture[i]);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}