import java.io.*;
 
class dacakeSPOJ {
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        int test=Integer.parseInt(br.readLine());
 
        for(int i=0;i<test;i++)
        {  
	int f=0,k=0;int l=0;
	
        String b=br.readLine();
          
        int arr1[]=new int[10];
        int min=0;
        int mini=0;
        
    	for(int j=0;j<b.length();j+=2)
    	{
 
  	  char c1=b.charAt(j);
    
	arr1[j/2]=(int)c1-48;
    
   	 }
      
	min=arr1[1];
      	mini=1;
      
	for(int j=2;j<10;j++)
      	{
 
        if(min>arr1[j])
	{
        min=arr1[j];
        mini=j;
 
    	}
      	}


	    f=0;
	    k=0;
	
	    String z="";
	    if(min>arr1[0])
 	   {
        	z="1";
      	  	mini=0;
        	min=arr1[0];
 	   }
	 
	        for(int j=0;j<=min;j++)
        	{	
		z=z+(char)(mini+48);
    		}
 
    	System.out.println(z);
    	z="";
        }
}
}
 
