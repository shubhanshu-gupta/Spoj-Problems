import java.io.*;

public class problemBcf {
	public static void main(String args[]) throws IOException
	{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	

/*	String str = in.readLine();

//	int n = Integer.parseInt(str.split(" ")[0]);
	int m = Integer.parseInt(str.split(" ")[1]);

	String[] str1 = in.readLine().split(" ");

	int[] arr = new int[str1.length];
	
	for(int i=0; i<str1.length; i++)
	{
	
//	String str1 = in.readLine();
	arr[i] = Integer.parseInt(str1[i]);
	
  	}

	for(int j=0; j<m; j++)
	{
//	int num1=0,num2=0,num3=0,num4=0;
	int h=0;
	String[] s = in.readLine().split(" ");
	
	int op = Integer.parseInt(s[0]);
//System.out.println(op);
	switch(op)
	{
	case '1':
	{
	int num1 = Integer.parseInt(s[1]);
	int num2 = Integer.parseInt(s[2]);

	arr[num1-1] = num2-h;

	break;
	}
	case '2':
	{
	 int num3 = Integer.parseInt(s[1]);
System.out.println(num3);
	h = h+num3;
	
//	System.out.println(arr[0]);
	break;
	}

	case '3':
	{
	int num4 = Integer.parseInt(s[1]);
	System.out.println(arr[num4-1]+h);
	}
	}
	}
	
}
	
}*/

		int m = Integer.parseInt(in.readLine().split(" ")[1]);

		String[] c = in.readLine().split(" ");
	
		int a[] = new int[c.length];
	
		for (int i = 0; i < c.length; i++) {
		a[i] = Integer.parseInt(c[i]);
		}
	

		int add = 0;
	
		for(int i = 0; i < m; i++) {
		
		String[] l1 = in.readLine().split(" ");
			
		switch (l1[0].charAt(0)) {
		
		case '1':
			a[Integer.parseInt(l1[1])- 1] = Integer.parseInt(l1[2]) - add;
				break;
			case '2':
				add += Integer.parseInt(l1[1]);
				break;
			case '3':
				System.out.println(a[Integer.parseInt(l1[1]) - 1] + add);
			}
		}
	}
}	
