// T.C: O(N);
// S.C: 0(N)
// Here we have strs which is list of strings so here we will take a hashmap so that we will store the string and its list of strings main concept here is to match the sorted string to the set of strings formed from that. now traverse through the strs so then we cannot sort the string itself so first convert it to char array. then sort that char array and then convert that sorted array to string. Now check whether the sorted string is in the map if the value of sorted string is null then add that sortedstr and then create new array list for that sorted str and again then get that sorted string and add that respective strs[i] to the arraylist created do for all the strings traversed in str. Finally return the arraylist of the values stored in the map with the corresponding list of strings.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
           char[] str= strs[i].toCharArray();
           Arrays.sort(str);
           String sortedstr= new String(str);
           if(map.get(sortedstr)==null)
           {
               map.put(sortedstr,new ArrayList<>());
           }
           map.get(sortedstr).add(strs[i]);

           
        }
        return new ArrayList<>(map.values());
        
    }
}