class Solution {
    public String solution(String myString) {
        for(char c:myString.toCharArray()){
            if(c<'l')
                myString=myString.replace(c,'l');
        }
        return myString;
    }
}