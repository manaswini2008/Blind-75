// T.C: O(N) 
// S.C: O(1) only left array ( o/p array is used)

/* In order to find the product except self of the nums array first we want to create an output array to store the running product 
 * So here I have first considered the length and then created the output array as left and as we are not going to consider the first 
 * element when we are doing left running product so assigning 0th element to 1 and then traverse through the nums array and do the 
 * product of the left[i-1]*nums[i-1] then we will get the running product of left side. We can also do this by taking another array
 * right and find right running sum so here it's taking O(n) space complexity so we have to do this in O(1) so we are taking a variable
 * called prod and then assign it to 1. In order to find ans we are first multiply the output array which is left[] with the prod and then
 * update the prod using the nums array here while doing this traverse in the reverse order. Finally return the output left[] array.
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        int prod=1;
        for(int i=n-1;i>=0;i--)
        {
            left[i]= left[i]*prod;
            prod=prod*nums[i];
        }
        return left;
        
    }
}