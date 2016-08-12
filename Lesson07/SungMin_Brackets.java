import java.util.*;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        
        Stack <Character> st = new Stack <Character>();
        
        for(int i=0;i<S.length();i++){
            
            char temp = S.charAt(i);
            if(temp=='('||temp=='['||temp=='{'){    
                st.push(temp);
            }
            else if(temp==')'){
                
                if(st.isEmpty()||st.pop()!='('){return 0;}
                //st.pop();
            }
            else if(temp==']'){
                if(st.isEmpty()||st.pop()!='['){return 0;}
                //st.pop();
            }
            else if(temp=='}'){
                
                if(st.isEmpty()||st.pop()!='{'){return 0;}  
                
                
            }
                
        }
        if(st.isEmpty())return 1;
        else return 0;
    }
}
