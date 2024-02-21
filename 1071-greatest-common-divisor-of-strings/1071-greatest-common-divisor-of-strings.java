class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int n = 1;
        int len1 = str1.length();
        int len2 = str2.length();
        while(n!=0){
            n = len1 % len2;
            if(n!=0){
                len1 = len2;
                len2 = n;
            }
        }
        return str2.substring(0,len2);
    }
}