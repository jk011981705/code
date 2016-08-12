// you can also use imports, for example: import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        
        Stack <Integer> upstreamF = new Stack <Integer>();
        
        int downCount=0;
        boolean start=false;
        
        for(int i=0;i<A.length;i++){
            
            if(B[i]==1&&start==false){
                
                start=true;
                upstreamF.push(A[i]);
                
            }
            else if(B[i]==1&&start==true){
                
                upstreamF.push(A[i]);
                
                
            }
            else if(B[i]==0&&start==false){
                
                downCount++;   
                
            }
            else{
                
                while(!upstreamF.isEmpty()){
                    
                    if(upstreamF.peek()>A[i]){
                        
                        break;   
                        
                        
                        
                    }
                    upstreamF.pop();
                    
                }
                if(upstreamF.isEmpty()){
                    
                    downCount++;    
                    
                    
                }
                     
                
                
                
                
            }
            
            
        }
        return downCount+upstreamF.size();
    }
}
