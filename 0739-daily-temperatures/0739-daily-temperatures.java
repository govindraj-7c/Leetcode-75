class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int n = t.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && t[i] > t[stack.peek()]){
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        return ans;
    }
}