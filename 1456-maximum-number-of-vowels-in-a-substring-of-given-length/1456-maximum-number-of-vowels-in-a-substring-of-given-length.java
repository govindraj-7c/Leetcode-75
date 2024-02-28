class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount;
        for(int i=0; i<k; i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        maxCount = count;
        for(int i=k; i<s.length(); i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
    public boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}