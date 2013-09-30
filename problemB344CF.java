import java.io.*;
import java.util.*;

public class problemB344CF {
		public static void main(String args[]) throws IOException
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String str = in.readLine();
			
//			int[] arr = new int[3];
//			int[] ar = new int[3];
			int a=0,b=0,c=0;
			
			for(int i=0; i<3; i++)
			{
//				arr[i] = Integer.parseInt(str.split(" ")[i]);
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
//				ar[i] = arr[i];
			}
			
			if((a+b+c)%2==1 || (a+b<c) || (a+c<b) || (b+c<a))
			{
				System.out.println("Impossible");
			}
			else
			{
				System.out.println((a+b-c)/2 + " " + (b+c-a)/2 + " " + (c+a-b)/2);
			}
		}
}

/*

			Arrays.sort(arr);

		//	int max=arr[2];

			if((arr[2]-arr[1])>1 || (arr[1]-arr[0])>1)
				{
					System.out.println("Impossible");
				}
			else
				{
					if(arr[0]==1 && arr[1]==1 && arr[2]==2)
						{
							System.out.println("0 1 1");
						}
					else if(arr[0]==3 && arr[1]==4 && arr[2]==5)
					{
						System.out.println("1 3 2");
					}
				}
			
		}
}
			
		
*/
