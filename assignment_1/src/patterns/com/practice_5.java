package patterns.com;

public class practice_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int n=10;
		
		for(int i=0; i<n;i++) 
		{
			
		   for(int j=0; j<=1.5*n;j++)
		   {
			   
			   if( i==0 && j<=n|| j==n/2 || i==n-1 && j<=n  ) 
			   {
			   
			       System.out.print("*");
			   }
			   else 
			   {
				   
				   System.out.print(" ");   
			   }
			   
			   
		   }
			
			
				
		    for(int j=0; j<=1.5*n;j++)
			   {
				   
				   if( j==0 || j==(n-1) || i==j ) 
				   {
				   
				       System.out.print("*");
				   }
				   else 
				   {
					   
					   System.out.print(" ");   
				   }
				   
				   
			   }
				
				
				for(int j=0; j<=1.5*n;j++)
				   {
					   
					   if( i==0 && j<=n|| j==0 || i==(n-1)/2 && j<=n || i==(n-1) && j<=n ) 
					   {
					   
					       System.out.print("*");
					   }
					   else 
					   {
						   
						   System.out.print(" ");   
					   }
					   
					   
				   }
				for(int j=0; j<=1.5*n;j++)
				   {
					   
					   if  (j==0 || (i==(n-1)&& j!=0) && j<=n ||j==n ) 
					   {
					   
					       System.out.print("*");
					   }
					   else 
					   {
						   
						   System.out.print(" ");   
					   }
					   
					   
				   }
				for(int j=0; j<=1.5*n;j++)
				   {
					   
					   if  (i==0 && j<=n || j==0 || (j==n && i<n/2)||i==(n-1)/2 && j<=n || i>=n/2 && i==j  ) 
					   {
					   
					       System.out.print("*");
					   }
					   else 
					   {
						   
						   System.out.print(" ");   
					   }
					   
					   
				   }
				for(int j=0; j<=1.5*n;j++)
				   {
					   
					   if  (i==0 && j<=n || i==(n-1)&& j<=n ||j==n || j==0 ) 
					   {
					   
					       System.out.print("*");
					   }
					   else 
					   {
						   
						   System.out.print(" ");   
					   }
					   
					   
				   }
				for(int j=0; j<=1.5*n;j++)
				   {
					   
					   if  (j==0 || j==(n-1) || i==j ) 
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


