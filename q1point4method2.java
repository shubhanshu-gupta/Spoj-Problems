import java.util.*;
import java.io.*;


class q1point4method2 {
	 public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
	
	int size = str.length();
	
//	System.out.println(replacespaces(str,size));
	
	}

	public void replacespaces(char[] strin, int length)
	{
	int spacecnt =0;

	for(int i=0; i<length; i++)
	{
	if(strin[i]==' ')
	{
	spacecnt++;
	}
	}

	int newlnth;
	newlnth = length + spacecnt*2;

	strin[newlnth] = '\0';

	for(int i=length-1; i>=0; i--)
	{
	if(strin[i]==' ')
	{
	strin[newlnth - 1] = '0';
	strin[newlnth - 2] = '2';
	strin[newlnth - 3] = '%';
	newlnth = newlnth - 3;
	}
	else	
	{
	strin[newlnth - 1] = strin[i];		
	newlnth = newlnth - 1;
	}
	}

	for(int j=0; j<newlnth; j++)
	{
	System.out.println(strin[j]);
	}
	}
}
