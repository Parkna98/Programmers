class Solution {
    public int solution(int[] date1, int[] date2) {
        String s1=""+date1[0]+date1[1]+date1[2];
        String s2=""+date2[0]+date2[1]+date2[2];
        return (Integer.parseInt(s1)<Integer.parseInt(s2))?1:0;
    }
}