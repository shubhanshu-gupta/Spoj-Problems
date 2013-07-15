import java.io.*;
import java.util.*;

public class problem318Acf {
        public static void main(String args[]) throws IOException
        {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  //      String str = in.readLine();

//        int n = Integer.parseInt(str.split(" ")[0]);
      //  int k = Integer.parseInt(str.split(" ")[1]);

	//int k = Integer.parseInt(in.readLine().split(" ")[1]);

	Scanner sc = new Scanner(System.in);
	long n =  sc.nextLong();
	long k =  sc.nextLong();
	long mid;
	if(n%2!=0)
	{
	mid = (n+1)/2;
//	long odd = mid;
	
//	if(k<)
	
	}
	else
	{
	mid = n/2;
//	long even = mid;
	}

	if(k<=mid)
	{
	System.out.println(2*k-1);
	}
	else
	{
	long even = k-mid;
	System.out.println(2*even);
	}
}
}
/*
//	long even = mid;
//	long 

		

	
//	String[] str = in.readLine().split(" ");
	
//	int n = Integer.parseInt(str[0]);
//	int k =	Integer.parseInt(str[1]);
	
//	System.out.println(n);
//	 System.out.println(k);


        ArrayList<Long> even = new ArrayList<Long>();
        ArrayList<Long> odd = new ArrayList<Long>();
        ArrayList<Long> list = new ArrayList<Long>();

//	long[] even = new long[];
//	long[] odd = new long[];
//	long[] list = new long[];
	
	

        for(long i=1; i<=n; i++)
        {
                if(i%2!=0)
                {
                odd.add(i);
                }
                else
                {
                even.add(i);
                }
        }

        long oddsize = odd.size();
        long evensize = even.size();
	
//	System.out.println(evensize);

	
	for(int j=0; j<oddsize; j++)
        {
        list.add(odd.get(j));
        }
	long size = list.size();

        for(int p=0; p<evensize; p++)
        {
        list.add(even.get(p));
 	}


/*        for(int g=0; g<n; g++)
        {
        System.out.println(list.get(g));
        }
*/
	
/*	System.out.println(list.get(k-1));



}
}
  */                                                                               
