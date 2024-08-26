/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
*/
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch==']'){
                if(st.isEmpty()||st.pop()!='['){
                    return false;
                }
            }
            else if(ch==')'){
                if(st.isEmpty()||st.pop()!='('){
                    return false;
                }
            }
            else if(ch=='}'){
                if(st.isEmpty()||st.pop()!='{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
