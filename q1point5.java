import java.io.*;
import java.util.*;

class q1point5 {
        public static void main(String args[]) throws IOException
        {
       
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();

/*	ArrayList<Character> c = new ArrayList<Character>();
	
	for(char ch : str.toCharArray())
	{
	c.add(ch);
	}

	int size = c.size();
	char[] ca = new char[size];
//	int[] num = new int[];

	ArrayList<Integer> num = new ArrayList<Integer>();	

	for(int i=0; i<size; i++)
	{
	ca[i] = c.get(i);
	num.add(Collections.frequency(c,ca[i]));
	System.out.println(num.get(i));
	}
*/

	String mystr = "";
	char first = str.charAt(0);
	int count =1;

	for(int i=1; i<str.length(); i++)
	{
	  if(str.charAt(i)==first)
	  {
		count++;
	  }
	  else
	  {
		mystr += first + "" + count;
		first = str.charAt(i);
		count =1;
	  }
	}
	System.out.println(mystr+first+count);
        }
}

