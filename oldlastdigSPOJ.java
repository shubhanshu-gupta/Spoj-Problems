import java.io.*;
//import java.util.*;


class oldlastdigSPOJ {
        public static void main(String args[]) throws IOException
        {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    //    String str = in.readLine();
        int test = Integer.parseInt(in.readLine());
        
        for(int i=0; i<test; i++)
        {
        String s = in.readLine();
        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);
        
        if(b==0)
        {       
        System.out.println("1");
        }
        else
        {
                b = b%4;
		
//		if(b==0)
//		{
//		b = 4;
//		}
		
                int ans=1;

                for(int j=0; j<b; j++)
                {
                ans *= a;
                }
                System.out.println(ans%10);
        }
        }
}
}

