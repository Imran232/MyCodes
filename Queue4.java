import java.util.*;


//========== User's Code Starts Here ==========

//Do not make the class as public
class Solution {
    class Node{
        int cnt;
        char c;
        Node(char c){
            this.c=c;
        }
    }
    public String solve(String A) {
        Node [] ch=new Node[26];
        StringBuilder sb=new StringBuilder("");
        
        for(int j=0;j<A.length();j++){
            char x=A.charAt(j);
            
            boolean found=false;
            
            for(int i=0;i<26 && !found;i++){
                if(ch[i]!=null && ch[i].c==x){
                    ch[i].cnt++;
                    found=true;
                }
            }
            
            for(int i=0;i<26 && !found;i++){
                if(ch[i]==null){
                    ch[i]=new Node(x);
                    ch[i].cnt=1;
                    found=true;
                }
            }
            
            found=false;
            for(int i=0;i<26 && !found;i++){
                if(ch[i]!=null && ch[i].cnt==1){
                    sb.append(ch[i].c);
                    found=true;
                }
            }
            if(!found)sb.append("#");
        }
        
        return sb.toString();
    }
}


//========== User's Code Ends Here ==========



public class Main
{
   
    
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n =sc.nextLine();
        Solution s = new Solution();
        
        String output = s.solve(n);
        System.out.println(output);
    }
}