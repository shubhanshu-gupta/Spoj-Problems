import java.util.*;
import java.math.*;
import java.io.*;

class axr1p3CS {
        public static void main(String args[]) throws IOException
        {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	while(true)
	{
	
	String str = in.readLine();

   //     Scanner in = new Scanner(System.in);

        if(str==null)
        {
	break;
	}

	else
	{
        BigInteger num = new BigInteger(str);

        if(str.equals("0")||str.equals("1"))
        {
        System.out.println(str);
        }
        else
        {
//        BigInteger num = new BigInteger(str);
//        System.out.println(num.subtract(BigInteger.ONE).multiply(BigInteger.valueOf(2)));
	System.out.println(num.multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(2)));  
      }
        }
	}
	
}
}









// This is a completely correct code...it's just that the online compilers are showing NZEC error with this code...
/*
import java.io.*;


class axr1p3CS {
        public static void main(String args[]) throws IOException
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
//      String str = in.readLine();

        while(true)
        {

         String str = in.readLine();
        
//System.out.println("//");
        if(str.trim().equals(""))
        {
        break;
//      System.out.println("//");
        }
        else
        {
        long n = Long.parseLong(str);
        
                if(n==1)
                {
                System.out.println(1);
                }
                else
                {
                long num = 2*n-2;
                System.out.println(num);
//              continue;
                }
        
        }
        
        }
}
}

  */   
