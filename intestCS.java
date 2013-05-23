import java.io.*;

class intestCS {
	public static void main(String args[]) throws IOException
	{
/*	String n,k;
	int n1,k1;
	int count=0;
	String str = "";

//	Scanner in = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
//	n = in.readLine();
//	k = in.readLine();
	str = in.readLine();
	n1 = Integer.parseInt(str.split(" ")[0]);
	k1 = Integer.parseInt(str.split(" ")[1]);
 
	String[] line = new String[n1];
	for(int i=0;i<n1;i++)
	{
		
	line[i] = in.readLine();
	
	}

	for(int i=0; i<n1; i++)
	{
	if(Integer.parseInt(line[i])%k1 == 0)
	{
	count++;
	}
	}
	System.out.println(count);
*/


		String str ="";
		int n;
		int k;
		int nbDivk=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//Read Input
		str = in.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		k = Integer.parseInt(str.split(" ")[1]);
		for(int i=0;i<n;i++)
		{
			if(Integer.parseInt(in.readLine())%k==0)
				nbDivk++;
		}
		System.out.println(nbDivk);
    }
}

	
