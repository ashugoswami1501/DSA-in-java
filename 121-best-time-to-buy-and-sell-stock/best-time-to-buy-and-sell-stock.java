class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length; 
      int low=Integer.MAX_VALUE;
      int profit=0;
      for(int i=0;i<n;i++){
        if(prices[i]<low){
        low=prices[i];
        }
        int p=prices[i]-low;
        if(p>profit){
            profit=p;
        }
      }
      return profit; 
    }
}