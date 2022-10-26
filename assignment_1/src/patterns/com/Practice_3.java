package patterns.com;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n=10;
		
		for(int i=0; i<n;i++) 
		{
			
		   for(int j=0; j<=2*n;j++)
		   {
			   
			   if( i>=j || i+j>=2*n  ) 
			   {
			   
			       System.out.print("*");
			   }
			   else 
			   {
				   
				   System.out.print(" ");   
			   }
			   
			   
		   }
			System.out.println();
		   
		  	
		}

	}

}
