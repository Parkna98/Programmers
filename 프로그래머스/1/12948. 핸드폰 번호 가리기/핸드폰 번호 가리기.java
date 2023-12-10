class Solution {
    public String solution(String phone_number) {
        int len=phone_number.length();
        String s=phone_number.substring(len-4,len);
        phone_number=phone_number.substring(0,len-4).replaceAll("[0-9]","*");
        return phone_number+s;
    }
}