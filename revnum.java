import java.io.*;

class revnum {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();

		int n = Integer.parseInt(str);
		reverse(n);
//		int n1 = reverse(n);
//		System.out.println(n1);
	}

	public static void reverse(int a)
	{
		
		if(a<10)
		{
			System.out.println(a);
			return;
		}
		else
		{
			System.out.print(a%10+"");
			reverse(a/10);
		}

/*
		int re = 0;
		while(a!=0)
		{
		re = re*10;
		re = re + a%10;
		a =a/10;
		 		
		reverse(a);
		}
//		else
//		{
		return re;
//		}
//	return 0;
	}
*/
}
}		

