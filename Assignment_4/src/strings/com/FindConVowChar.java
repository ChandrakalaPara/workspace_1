package strings.com;

public class FindConVowChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="ineuron@Bangaluru**2022";
		
		int vow_count=0,con_count=0,spl_count=0;
		
		s=s.toLowerCase();
		
           for (int  i=0;i<=s.length()-1;i++) {
        	
        	   if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
        		   
        		   vow_count++;
        		       
        		}
        	   else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
        		   
        		   con_count++;
        		
        	    }
        	   else if(s.charAt(i)>=0 && s.charAt(i)<=9) {
        		   
        		   
        	   }
        	   
        	   else {
        		   
        		   spl_count++;
        	   }
        	
        	}
           
           System.out.println("vowel count is:" +vow_count);
           System.out.println("consonants count is : "+con_count);
           System.out.println("special chars count is : " +spl_count);

	}

}
