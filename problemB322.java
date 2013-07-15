import java.io.*;
import java.util.*;

public class problemB322 {
	public static void main(String args[]) throws IOException
	{
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st;
//        String str = in.readLine();
	
	int[] arr = new int[3];
//	int[] n = new int[3];

	 st = new StringTokenizer(in.readLine());
        
        int j=0;
        while(st.hasMoreTokens())
        {
        arr[j] = Integer.parseInt(st.nextToken());
        j++;
        }
	
	int num=0;

	num = arr[0]/3 + arr[1]/3 + arr[2]/3;
	if((arr[0]%3==2 && arr[1]%3==2 && arr[2]%3==0 && arr[2]/3!=0) || (arr[0]%3==2 && arr[1]%3==0 && arr[2]%3==2 && arr[1]/3!=0)
		|| (arr[0]%3==0 && arr[1]%3==2 && arr[2]%3==2 && arr[0]/3!=0))
	{
	num++;
	}
	else
	{
	num += Math.min(arr[0]%3, Math.min(arr[1]%3,arr[2]%3));
	}
	System.out.println(num);

/*

	for(int i=0; i<3; i++)
	{
		if(arr[i]>=3)
		{
		if(arr[i]%3==0)
		{
		num += arr[i]/3;
		}
		else
		{
		n[i] = arr[i]-3;
		num+=1;
		k+=n[i];
//		System.out.println(k);
		}
		}
		else
		{
		k+=arr[i];
		}
//	cn = num;
	}
	
//	System.out.println(k);


	if(k%3==0)
	{
	num += (k/3);
	}
	else
	{
	num += 1;
	}
		
System.out.println(num);*/
}
}

