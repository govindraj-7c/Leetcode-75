class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            if(a>0){
                stack.push(a);
            }
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(a)){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(a);
                }
                else if(stack.peek() + a == 0){
                    stack.pop();
                }
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}