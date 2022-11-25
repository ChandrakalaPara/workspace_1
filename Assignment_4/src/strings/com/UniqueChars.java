package strings.com;

public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Bengaluru";
		
		int i=0, k=0;
		int count=0;
		
		for ( i=0;i<=s.length()-1;i++) {
			count=0;
			
			for (int j=0;j<=s.length()-1;j++) {
				
				
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
						
				}
				
			}
			
			}
		
		if(count<=1) {
			
			System.out.println("The charecters in the given string are unique");
			
		}
		else
			
			System.out.println("The charecters in the given string are not unique");

	}

}
