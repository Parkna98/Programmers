class Solution {
    public int[] solution(int[] arr) {
        StringBuilder sb=new StringBuilder();
        for(int i:arr)
            sb.append(i+"");
        String s=sb.toString();
        while(s.indexOf("00")!=-1 || s.indexOf("11")!=-1)
        {
            s=s.replace("00","");
            s=s.replace("11","");
        }
        if(s.equals("")) return new int[]{-1};
        int[] answer=new int[s.length()];
        int idx=0;
        for(char c:s.toCharArray()){
            answer[idx++]=c-'0';
        }
        return answer;
    }
}