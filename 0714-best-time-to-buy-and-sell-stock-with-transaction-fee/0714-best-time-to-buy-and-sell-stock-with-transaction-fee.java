class Solution {
    int[][] ans = new int[50001][2];
    public int maxProfit(int[] prices, int fee) {
        for(int[] row : ans)
            Arrays.fill(row,-1);
        return solution(prices, fee, prices.length, 0, 1);
    }
    public int solution(int[] prices, int fee, int len, int idx, int flag){
        if(idx >= len){
            return 0;
        }
        int profit = 0;
        if(ans[idx][flag] != -1){
            return ans[idx][flag];
        }
        //Buy
        if(flag == 1){
            int buys = solution(prices, fee, len, idx+1, 0) - prices[idx] - fee;
            int not_buys = solution(prices, fee, len, idx+1, 1);
            profit = Math.max(buys, not_buys);
        }
        //sell
        else{
            int sells = solution(prices, fee, len, idx+1, 1) + prices[idx];
            int not_sells = solution(prices, fee, len, idx+1, 0);
            profit = Math.max(sells, not_sells);
        }

        return ans[idx][flag] = profit;
    }
}