class Solution {
    public String decodeString(String s) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<StringBuilder> stack2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                n = n*10 + (c-'0');
            }
            else if(c == '['){
                stack1.push(n);
                n = 0;
                stack2.push(sb);
                sb = new StringBuilder();
            }
            else if(c == ']'){
                int k = stack1.pop();
                StringBuilder temp = sb;
                sb = stack2.pop();
                while(k-- > 0){
                    sb.append(temp);
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}