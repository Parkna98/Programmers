class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int[] irr:queries){
            for(int i=irr[0];i<=irr[1];i++){
                arr[i]++;
            }
        }
        return answer;
    }
}