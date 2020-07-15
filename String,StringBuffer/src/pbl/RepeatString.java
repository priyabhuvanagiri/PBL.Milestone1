package pbl;
import java.util.*; 
public class RepeatString {
	public static String changeto(String s1) {
        String s,ans="";
        if(s1.length()<2) {
            return s1;
        }
        else {
            s=s1.substring(0,2);
        }
        for(int u=0;u<s1.length();u++) {
            ans+=s;
        }
        return ans;
}
 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        System.out.print(changeto(s1));
   }    
}

	
	 



