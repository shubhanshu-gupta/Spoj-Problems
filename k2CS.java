import java.io.*;
import java.util.*;

class k2CS {

	public static String baseexpansion(long num,long b)
	{
	long q = num;
//	int k=0;
	String str1="";

	List<Long> c = new ArrayList<Long>(); 

	while(q!=0)
	{
	c.add(q%b);
	q = (q/b);
//	k = k+1;
	}

	for(int l=c.size()-1; l>=0; l--)
        {
        str1 += Long.toString(c.get(l));

        }
	return str1;
	}


	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String s = in.readLine();
	int test = Integer.parseInt(s);

	for(int i=0; i<test ; i++)
	{
	String str = in.readLine();
	
	long n = Long.parseLong(str);
	
	      if(n==1)
        {
        System.out.println(2);
//        break;
        }



	for(long u=2; u<=n; u++)
	{



	String stri = baseexpansion(n,u);
//	System.out.println(stri);
	
	long palin = Long.parseLong(stri);
	
	boolean fl = isPalindrome(palin);
//	System.out.println(fl);	
	
	if(fl==true)
	{
	System.out.println(u);
	break;
	}
	}
	
	}
}


	 public static boolean isPalindrome(long number) {
        long palindrome = number; // copied number into variable
        long reverse = 0;

        while (palindrome != 0) {
            long remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
