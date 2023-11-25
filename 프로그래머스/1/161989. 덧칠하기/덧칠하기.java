class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int num=0;
        int last=section[section.length-1];
        for(int i=0;i<section.length;i++){
            int paint=minvalue(section,num);
            answer++;
            num=paint+m-1;
            if(num>=last) break;
        }
        return answer;
    }
    public int minvalue(int[] section,int num){
        int min=0;
        for(int i:section){
            if(i>num){
                min=i;
                break;
            }
        }
        return min;
    }
}