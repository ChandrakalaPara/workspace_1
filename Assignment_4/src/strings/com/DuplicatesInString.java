package strings.com;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="chandrakala para";
		char [] ar= new char[10];
		int i=0, k=0;
		int count=0;
		
		for ( i=0;i<=s.length()-1;i++) {
			count=0;
			
			for (int j=0;j<=s.length()-1;j++) {
				
				
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
						
				}
				
			}
			
			if(count>1) {	
				ar[k]=s.charAt(i);
				System.out.println(ar[k]);
				k++;
			}
			
			
		}
			

	}

}
