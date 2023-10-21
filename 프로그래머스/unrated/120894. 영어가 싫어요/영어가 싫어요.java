class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] sa={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] ia={"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0;i<sa.length;i++){
            numbers=numbers.replaceAll(sa[i],ia[i]);
        }
        answer=Long.valueOf(numbers);
        return answer;
    }
}