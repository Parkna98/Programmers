class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
          int[] ans={-1};
            return ans;
        } 
        
        int[] answer = new int[arr.length-1];
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i:arr){
            if(i<min) min=i;
        }
        for(int i:arr){
            if(i!=min)
                answer[count++]=i;
        }
        return answer;
    }
}