import java.io.*;

class atticCS {
	public static void main(String args[])
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String s = in.readLine();
	int test = Integer.parseInt(s);
	
	for(int i=0; i<test; i++)
	{
	String str = in.readLine();
	
	char[] c = str.toCharArray();
	
	int days=0;
	
	for(int j=0; j<str.length; j++)
	{
		if(c[j]=='.' && c[j+1]!='#')
		{
		days++;
		}
	
