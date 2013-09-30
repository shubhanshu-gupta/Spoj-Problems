import java.io.*;

class datribSPOJ {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		int t = Integer.parseInt(str);

		for(int i=0; i<t; i++)
		{
			String st = in.readLine();
			int n = Integer.parseInt(st);

			int ans = tribo(n);

			System.out.println(ans);
		}
	}

	public static int tribo(int a)
	{

			int[] r = new int[a+1];

//			r[0] = 0;
//			r[1] = 0;
//			r[2] = 1;
//			r[3] = 1;
			
			if(a==1)
			{
				return 0;
			}
			else if(a==2)
			{
				return 1;
			}
			else
			{
			r[1]=0;
			r[2]=1;
			r[3]=1;

			for(int j=4; j<=a; j++)
			{
				r[j] = r[j-1] + r[j-2] + r[j-3];
			}

			return r[a];
			}
		}
	}

