import java.util.*;
class ValidParenthesis{
    public static void main(String[] args){
        String s="({})[]";
        System.out.println(isValid(s));
    }
    static public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        if (s.length()%2!=0){
            return false;
        }
        for (char c:s.toCharArray()){
            if (c==')' && !st.isEmpty() && st.peek()=='('){
              st.pop();
            }
            else if (c==']' && !st.isEmpty() && st.peek()=='['){
              st.pop();
            }
            else if (c=='}' && !st.isEmpty() && st.peek()=='{'){
              st.pop();
            }
            else{         
              st.push(c);
          

            }
        
            
        }
   return st.isEmpty();
        
    }
}