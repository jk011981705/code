import java.util.*;

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        
        
        Stack <Integer> st = new Stack <Integer>();
        int temp;
        int count =0;
        //st.push(H[0]);
        
        for(int i=0;i<H.length;i++){
            
            
            if(st.isEmpty()){
                st.push(H[i]);   
                count++;
                
                
            }
            else if(st.peek()>H[i]) {
                
                
                while(!st.isEmpty()){
                    temp=st.pop();
                    if(temp==H[i]) {
                        st.push(temp);
                        break;
                    }
                    else if(temp<H[i]){
                        st.push(temp);
                        st.push(H[i]);
                        count++;
                        break;
                    }
                }
                if(st.isEmpty()){
                    st.push(H[i]);
                    count++;
                    //return i;
                }
                
            }
            else if(st.peek()<H[i]){
                //return st.peek(); 
                st.push(H[i]);
                count++;
                
            }
            else if(st.peek()==H[i]) continue;
            else {
             //return i;   
            }
 
        }
        return count;
    }
}
