class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(bCheck(sum))
                        answer++;
                }
            }
        }

        return answer;
    }
    public boolean bCheck(int n){
        if(n%2==0) return false;
        else{
            for(int i=3;i<=n/2;i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }
}