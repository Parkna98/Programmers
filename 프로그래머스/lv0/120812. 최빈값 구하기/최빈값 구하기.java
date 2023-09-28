class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxcount=0;
        int count[]=new int[1000];
        for(int i=0;i<array.length;i++) {
            count[array[i]]++;
            if(count[array[i]]>maxcount){
                maxcount=count[array[i]];
                answer=array[i];
            }
        }
        int check=0;
        for(int i:count){
            if(maxcount==i) check++;
            if(check>1) 
                answer=-1;
        }
            
        
        return answer;
    }
}