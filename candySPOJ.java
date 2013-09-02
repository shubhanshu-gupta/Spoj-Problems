import java.io.*;
import java.util.*;

class candySPOJ {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//        String str = in.readLine();
//        int n = Integer.parseInt(str);

//	ArrayList<Integer> c = new ArrayList<Integer>();
//	long sum=0,cnt=0,n,i,j,avg;

	int n,i,j,avg,sum=0,cnt=0;	

	ArrayList<Integer> c = new ArrayList<Integer>(10001);

	  while((n=Integer.parseInt(in.readLine()))!=-1)
          {

//	ArrayList<Integer> c = new ArrayList<Integer>(10001);

		   	for(i=0; i<n; i++)
		   	{
			c.add(Integer.parseInt(in.readLine()));
			sum += c.get(i);	
			}

			if(sum%n!=0)
			{System.out.println("-1");}
			else
			{
				 avg = sum/n;

				for(j=0; j<n; j++)
				{
					if(avg>c.get(j))
					{
					cnt += (avg-c.get(j));
					}
				}
			System.out.println(cnt);
			}
	c.clear();
	}
}
}
		
	

