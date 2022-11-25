package strings.com;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="2552";
		
		Boolean flag= true;
		
		int n=s.length()-1;
        for (int  i=0;i<=s.length()-1;i++) {
        	
        	if(s.charAt(i)!=s.charAt(n-i)) {
        		flag= false;
        		       
        		System.out.println("The given number is not palindrome");
        		break;
        	
        		}
        	
        	}
        if(flag==true) 
        	System.out.println("The given number is palindrome");
        	
       
        
        	
        }
}


