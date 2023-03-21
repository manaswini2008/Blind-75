// T.C: O(N) 
// S.C : O(N) Hashset is used 

/* In order to find duplicates we are using Hashset in which first create a hashset so that  while traversing through the array 
 * add one by one elements by using set.add and then check if hashset contains any element that is getting repeated by using set.contains
 * then return true because its repeated and duplicate value is already presented in the hashset.
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set =new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
           if(set.contains(nums[i])) // t.c FOR contains is O(1) we can access any elements in constant time in Hashset.
           {
               return true;
           }
           set.add(nums[i]);
       }
       return false;
    }
}
