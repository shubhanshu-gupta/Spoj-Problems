import java.io.*;

class absysSPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();
	int test = Integer.parseInt(str);

	String y = in.readLine();

	for(int i=0; i<test; i++)
	{
	String s = in.readLine();

	String s1 = in.readLine();
	String[] st = s1.split(" ");

//	for(int j=0; j<st.length; j++)
//	{
	//	System.out.println(st[j]);
	
	if(st[0].contains("machula")==true)
	{
	int a = Integer.parseInt(st[4]);
	int b = Integer.parseInt(st[2]);
	int c = a-b;
	st[0] = String.valueOf(c);
	System.out.println(st[0]+" + "+st[2]+" = "+st[4] );
	}
	
	else if(st[2].contains("machula")==true)
        {
        int a = Integer.parseInt(st[4]);
        int b = Integer.parseInt(st[0]);
        int c = a-b;
        st[2] = String.valueOf(c);
        System.out.println(st[0]+" + "+st[2]+" = "+st[4] );
        }
	
	else if(st[4].contains("machula")==true)
        {
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[2]);
        int c = a+b;
        st[4] = String.valueOf(c);
        System.out.println(st[0]+" + "+st[2]+" = "+st[4] );
        }
	else
	{
	break;
	}

	String stri = in.readLine();
	}

}
}
