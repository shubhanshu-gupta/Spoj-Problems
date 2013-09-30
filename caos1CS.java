import java.io.*;

class caos1CS {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int test = Integer.parseInt(str);

	for(int i=0; i<test; i++)
	{
	String st = in.readLine();

	int r = Integer.parseInt(st.split(" ")[0]);
	int c = Integer.parseInt(st.split(" ")[1]);
	
	String[] map = new String[r];

	for(int l=0; l<r; l++)
	{
		map[l] = in.readLine();
	}

	int cnt=0;
	for(int ro=2; ro<r-2; ro++)
	{
		for(int co=2; co<c-2; co++)
		{
			if(map[ro].charAt(co)=='^')
			{
				if(sidecheck(map,ro,co,1)&&sidecheck(map,ro,co,2))
				{
					cnt++;
				}
			}
		}
	}
	System.out.println(cnt);
	}

	}


	public static Boolean sidecheck(String[] m, int row, int col, int n)
	{
		if((m[row].charAt(col-n)=='^')&&(m[row-n].charAt(col)=='^')&&(m[row+n].charAt(col)=='^')&&(m[row].charAt(col+n)=='^'))
			return true;
		else
			return false;
	}
}

/*


	char[][] arr = new char[r][c];

	for(int j=0; j<r; j++)
	{
	String s = in.readLine();

	for(int h=0; h<c; h++)
	   {
	//	String s = in.readLine();
		arr[j][h] = s.charAt(h);
		
	   }
	}

/*	for(int j=0; j<r; j++)   
        {
//        String s = in.readLine();

        for(int h=0; h<c; h++)
           {
        //      String s = in.readLine();
                System.out.print(arr[j][h]+" ");
                
           }
        }
*/
/*
	if(r<=4||c<=4)
	{
	System.out.println(0);
	}
	else
	{
		for(int e=3; e<=(r-2); e++)
		  {
		    for(int y=3; y<=(c-2); y++)
			{
		 		if(arr[e][y]=='^')
				{
				System.out.println(0);
				break;
				}
				else
				{
				
				}
			}
		}
	}
}
}*/
