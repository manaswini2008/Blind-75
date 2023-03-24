//T.C: O(N)
//S.C: O(1)
// First  for getting the palindrome I am considering 2 indexes which are low and high so that I can access the elements at the indexes low and high for further comparison. Then check whether the both the elements are alphanumeric by using character class function isLetterOrDigit(). if both the elements compared are alphanumeric then according to the problem statement we should convert all the uppercase letters into lowercase so convert them and check whether they are equal or not to check it as palindrome. If both are equal then check for all the elements in the string by incrementing low and decrementing high. if they are not equal then there is no chance of becoming a palindrome so return false. Then if the elements are not alphanumeric then we should remove it so just skip that element and check the next element. Here check the low then if it is not alphanumeric then skip and increment index else decrement the high index.

class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(s.isEmpty()) return true;
        int low=0,high=n-1;
        while(low<high)
        {
            char currLow= s.charAt(low);
            char currHigh=s.charAt(high);
            if(Character.isLetterOrDigit(currLow) && Character.isLetterOrDigit(currHigh))
            {
                if(Character.toLowerCase(currLow)==Character.toLowerCase(currHigh))
                {
                    low++;
                    high--;
                }
                else
                {
                    return false;
                }
            }
            else
            {
              if(!Character.isLetterOrDigit(currHigh))
              {
                  high--;
              }
              else
              {
                  low++;
              }
              

            } 
           
        }
        return true;
        
}

    }

