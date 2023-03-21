// T.C: O(N)
// S.C: O(N)

/* The main goal here is to insert open and close brackets given if the bracket is closed by respective closed bracket then return true
 * So for this first we take a stack and then find the length of string then push all the open brackets into the stack and then to find 
 * whether it is closed or not for that check whether open brackets by checking the stack is empty and the value at the top is respective
 * open brackets then pop it else return false do this for all the brackets. Check whether the stack is empty then return true else false.
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n)
        {
           char c=s.charAt(i);
           if(c=='(')
           {
               st.push(c);
           }
           else if(c=='[')
           {
               st.push(c);
           }
           else if(c=='{')
           {
               st.push(c);
           }
           else if(c==')')
           {
               if(!st.isEmpty() && st.peek()=='(')
               {
                   st.pop();
               }
                else{
                  return false;
               }
           }
           else if(c==']')
           {
               if(!st.isEmpty() && st.peek()=='[')
               {
                   st.pop();
               }
                else{
                  return false;
               }
           }
           else if(c=='}')
           {
              if(!st.isEmpty() && st.peek()=='{')
               {
                   st.pop();
               }
                else{
                  return false;
               }
           }
           i++;

          

        }
         if(st.isEmpty())
           return true;
         else
           return false;

    }
}