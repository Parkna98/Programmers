import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr=new int[4];
        arr[0]=a; arr[1]=b; arr[2]=c; arr[3]=d;
        Arrays.sort(arr);
        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]){
            answer=1111*arr[0];
        }
        else if(arr[0]==arr[1] && arr[2]==arr[3]){
            answer=(arr[0]+arr[2])*(arr[2]-arr[0]);
        }
        else if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]!=arr[3]){
            answer=(int)Math.pow((10*arr[0]+arr[3]),2);
        }
        else if(arr[1]==arr[2] && arr[2]==arr[3] && arr[0]!=arr[3]){
            answer=(int)Math.pow((10*arr[3]+arr[0]),2);
        }
        else if(!(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[3])){
            answer=arr[0];
        }
        else{
            if(arr[0]==arr[1])
                answer=arr[2]*arr[3];
            else if(arr[1]==arr[2])
                answer=arr[0]*arr[3];
            else
                answer=arr[0]*arr[1];
        }
        return answer;
    }
}