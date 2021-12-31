package LeetCode.Easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int bought = prices[0];

        for (int i=1;i<prices.length;i++){
            if (bought<prices[i]) {
                if (ans<(prices[i]-bought)){
                    ans = prices[i]-bought;
                }
            } else {
                bought = prices[i];
            }
        }
        return ans;
    }
}
