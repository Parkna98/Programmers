class Solution {
    public int solution(int n) {
        String triple=Integer.toString(n,3);
        StringBuilder sb=new StringBuilder(triple);
        String rev=sb.reverse().toString();
        int answer=Integer.parseInt(rev,3);
        return answer;
    }
}