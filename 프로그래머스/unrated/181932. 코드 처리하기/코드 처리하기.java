class Solution {
    public String solution(String code) {
        String answer = "";
        String ret="";
        int mode=0;
        boolean modeCheck=false;
        for(int idx=0;idx<code.length();idx++){
            mode=(modeCheck==false)?0:1;
            if(mode==0){
                if(code.charAt(idx)=='1'){
                    modeCheck= !modeCheck;
                }
                else if(idx%2==0){
                    ret+=code.charAt(idx);
                }
            }
            
            else{
                if(code.charAt(idx)=='1'){
                    modeCheck= !modeCheck;
                }
                else if(idx%2!=0){
                    ret+=code.charAt(idx);
                }
            }
        }
        return answer=(ret!="")?ret:"EMPTY";
    }
}