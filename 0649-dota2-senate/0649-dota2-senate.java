class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = 0;
        for(int ch : senate.toCharArray()){
            if(ch == 'R'){
                rad.add(n);
                n++;
            }
            else if(ch == 'D'){
                dir.add(n);
                n++;
            }
        }
        while(!rad.isEmpty() && !dir.isEmpty()){
            if(rad.peek() < dir.peek()){
                rad.add(n++);
            }
            else if(rad.peek() > dir.peek()){
                dir.add(n++);
            }
            rad.remove();
            dir.remove();
        }
        if(rad.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}