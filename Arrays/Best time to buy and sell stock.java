
//T.C : O(n)Traversing only once
//S.C : O(1) bcz extra var are not created same var is getting updated again and again

/* In this we have to find maximum profit so, we have the prices array so prices range is upto 10 power 4
 so I assigned value of minprice to INTEGER.MAX_VALUE and max profit to 0. So now traverse the pointer i 
 through the prices array and find the minprice by comparing the prices and minprice and then after that 
 find the diff between Prices and the minprice so that we will get the profit so compare this profit and 
 find the maxprofit so then return max profit. */
 
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
               minprice=prices[i];
            if(maxprofit<prices[i]-minprice)
                maxprofit=prices[i]-minprice;
        }
        return maxprofit;
    }
}
}


