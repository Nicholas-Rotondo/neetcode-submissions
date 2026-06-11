class Solution {
    public int maxProfit(int[] prices) {
        int j = 0;
        int maxRes = 0;
        int leng = prices.length-1;
        // don't forget to find the difference between i and j and then use
        // lowestElem to start from
        for(int i = 0; i < leng; i++) {
            j = i + 1;
            if(prices[i] < prices[j]) {
                System.out.println("prices[i] is less than, i is: " + i);
                for(int ndx = j; ndx < leng+1; ndx++) {
                    int largestDifference = prices[ndx]- prices[i];
                    System.out.println("largestDifference is: " + largestDifference);
                    maxRes = Math.max(largestDifference, maxRes);
                    System.out.println("ndx is: "+ ndx);
                }
            }
        }
        return maxRes;
    }
}
