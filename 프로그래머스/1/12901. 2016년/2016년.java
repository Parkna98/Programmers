class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String strWeek[] = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int lastday[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int total=0;
        for(int i=1;i<a;i++){
            total+=lastday[i];
        }
        total+=b;
        return strWeek[(total+3)%7];
    }
}