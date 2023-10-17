class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ss=my_string.split("");
        for(int i=0;i<ss.length-1;i++){
            for(int j=i+1;j<ss.length;j++){
                if(ss[i].equals(ss[j]))
                    ss[j]="";
            }
        }
        for (String s:ss)
            answer+=s;
        return answer;
    }
}