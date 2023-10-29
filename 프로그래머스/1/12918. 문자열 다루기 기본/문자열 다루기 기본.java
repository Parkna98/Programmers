class Solution {
    public boolean solution(String s) {
        boolean match=s.matches("[0-9]{4}||[0-9]{6}");
        return match;
    }
}