class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String num1=toBinary(arr1[i],n);
            String num2=toBinary(arr2[i],n);
            String row="";
            for(int j=0;j<n;j++){
                if(bCheck(num1.charAt(j),num2.charAt(j))){
                    row+="#";
                }
                else{
                    row+=" ";
                }
            }
            answer[i]=row;
        }
        
        return answer;
    }
    public boolean bCheck(char n1,char n2){
        if(n1=='1'||n2=='1') return true;
        else return false;
    }
    public String toBinary(long num,int n){
        String number="";
        number=String.format("%0"+n+"d",Long.parseLong(Long.toBinaryString(num)));
        return number;
    }
}