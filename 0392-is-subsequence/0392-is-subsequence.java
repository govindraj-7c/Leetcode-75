class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        int j = 0;
        for(int i=0; i<t.length(); i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            if(j == s.length()){
                break;
            }
        }
        if(j == s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}