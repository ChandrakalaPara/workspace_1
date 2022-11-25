package strings.com;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        String s ="The quick brown fox jumps over the lazy dog";
		
		s=s.toLowerCase();
		s=s.replace(" ","");
		int n=s.length();
		char[] array = new char[25]; 
		
		for(int i=0; i<n;i++) {
		
		     i=122-s.charAt(i);
		     
		     System.out.println(n);
			
			System.out.println("the given string is not a pangram" + (int)s.charAt(i));
          
			
		}
		
		
		
		

	}

}
