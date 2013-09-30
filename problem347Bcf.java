import java.io.*;
import java.util.*;

public class problem347Bcf 
{
	    public static void main(String args[]) throws IOException
		        {
				 Scanner scan = new Scanner(System.in);
				 int n = scan.nextInt();
				 int arr[] = new int[n];
				
			  	 for(int i=0;i<n;i++)
				 {
					 arr[i] = scan.nextInt();
				 }				        
							 int sum = 0;
							for(int i=0;i<n;i++)
							{
							            if(arr[i]==i)
							                    sum++;
							  }
										        
									     boolean flag = false;
									        for(int i=0;i<n;i++)
										        {
										            if(arr[i] != i)
										                {
										                if(arr[arr[i]]==i)
												                {
												                    flag = true;
												                        break;
												                }
												  }
											    }
											if(sum!=n && flag==false)
											          sum = sum+1;
											 else if(sum!=n && flag==true)
											           sum=sum+2;
														        
														        
											  System.out.println(sum);
				}
}



/*import java.io.*;
import java.util.*;

public class problem347Bcf {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		int test = Integer.parseInt(str);
		int count=0;
		int[] arr = new int[test];
		
		String st = in.readLine();

		for(int i=0; i<test; i++)
		{
	//	String st = in.readLine();
		
		arr[i] = Integer.parseInt(st.split(" ")[i]);

//		System.out.println(arr[i]);
		}
		
		boolean flag = false;

		for(int j=0; j<test; j++)
		{
			if(arr[j]==j)
			{
				count++;
//				System.out.println(count);
			}
		}

		for(int h=0; h<test; h++)
		{
			if(arr[h]!=h)
			{
				if(arr[arr[h]]==h)
				{
				flag = true;	
				break;
				}
			}
		}

		if(count!=test && flag==false)
		{
			count+=1;
//			System.out.println(count);
		}
		else if(count!=test && flag==true)
		{
			count+=2;
//			System.out.println(count);
		}

		System.out.println(count);	
*/
	/*
				int k=j,l=j;

				while(arr[l]!=k)
				{
				l++;
				}
				arr[k] = arr[l];
//				System.out.println(arr[k]);
				count++;
				break;
			}
		}
		System.out.println(count);
	 
	}
}
*/


