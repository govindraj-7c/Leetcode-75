class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int i=0, j=0, k=0;
        String ans = "";
        while(i < len1+len2){
            if(j<len1){
                ans += ch1[j++];
                i++;
            }
            if(k<len2){
                ans += ch2[k++];
                i++;
            }
        }
        return ans;
    }
}