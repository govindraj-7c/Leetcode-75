class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> list = new ArrayList<>();
        if(chars.length == 1){
            return 1;
        }
        int count = 1;
        for(int i=0; i<chars.length-1; i++){
            if(chars[i] == chars[i+1]){
                count++;
            }
            else{
                list.add(chars[i]);
                if(count>1){
                    for(char digit : Integer.toString(count).toCharArray()){
                        list.add(digit);
                    }
                }
                count = 1;
            }
        }
        list.add(chars[chars.length - 1]);
        if (count > 1) {
            for (char digit : Integer.toString(count).toCharArray()) {
                list.add(digit);
            }
        }
        for(int i=0; i<list.size(); i++){
            chars[i] = list.get(i);
        }
        return list.size();
    }
}