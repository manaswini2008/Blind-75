//T.C: O(N) traversing the whole array only once
//S.C: O(N) We are pushing n elements into the Hashmap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length; // finding lenght of the array nums
        Map<Integer,Integer> map=new HashMap<>(); // creating a hashmap so that the indices and values are inserted into it.
        for(int i=0;i<n;i++) // [2]
        {
            int f=nums[i];//[2] // determines the first element of the nums
            int l= target-f;//[7] // finding the complement
            if(map.containsKey(l))// yes // By using containsKey method search for complement in the hashmap if it present then
            {
                return new int[]{map.get(l),i};//[0,1] return the index of the complement using get and the resepective i value
            }
            map.put(f,i); //{2,0} // if it is the first time inserting into hashmap then use put function and insert it.
        }
        return null;
    } 
}