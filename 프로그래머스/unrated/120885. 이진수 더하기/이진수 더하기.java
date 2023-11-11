class Solution {
    public String solution(String bin1, String bin2) {
        int b1=0;
        int b2=0;
        int idx1=0;
        int idx2=0;
        for(int i=bin1.length()-1;i>=0;i--){
            if(bin1.charAt(i)=='1'){
                b1+=Math.pow(2,idx1);
            }
            idx1++;
        }
        
        for(int i=bin2.length()-1;i>=0;i--){
            if(bin2.charAt(i)=='1'){
                b2+=Math.pow(2,idx2);
            }
            idx2++;
        }
        
        return Integer.toBinaryString(b1+b2);
    }
}