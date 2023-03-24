//T.C: O(N)
//S.C: O(N)
// So To find it is anagram or not i am using a hashmap to store the characters and their count in that particular string. then traverse through the string s then if its the first time then keep the character in the map and mark count as 1 else store the character again increment by count by 1. we are now done with traversing the string s then to traverse the string t do the same thing traverse the t then we should definitely see for the conditions inside the map so we are not supposed to add new elements because the elements must be same in both the strings if we are adding a new character then directly its false. then if the map contains the element already and if the count is equal to 1 here in the string t then we can remove it as it is already there in s our main aim here is to make the map empty by comparing 2 strings s and t if the map contains more than 1 then decrement the count by 1 in every iteration. then finally return if the map is empty or not.
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
            map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
           if(map.containsKey(t.charAt(i)))
           {
               if(map.get(t.charAt(i))==1)
               {
                   map.remove(t.charAt(i));
               }
               else
               {
                   map.put(t.charAt(i),map.get(t.charAt(i))-1);
               }


           }
           else
           {
               return false;
           }
        }
        return map.isEmpty();

    }
}