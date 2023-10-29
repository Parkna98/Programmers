class Solution {
    public int[] solution(String s) {
        int loop=0;
        int removed=0;
        while(!s.equals("1")){
            loop++;
            removed+=zeroCount(s);
            int ones=s.length()-zeroCount(s);
            s=Integer.toString(ones,2);
        }
        return new int[] {loop,removed};
    }
    private int zeroCount(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='0')
                count++;
        }
        return count;
    }
}