import java.io.*;
import java.util.*;

public class problemA344CF{
		public static void main(String args[]) throws IOException
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String str = in.readLine();
				
			int n = Integer.parseInt(str);
//			String[] s = new String[n+1];
			ArrayList<String> s = new ArrayList<String>();

			for(int i=0; i<n; i++)
			{
				int c1=0,c2=0, count=1;

				s.add(in.readLine());
			}
		
			int flag=1;

//			for(int j=0; j<s.size(); j++)
//				{
//					if(j!=)
			int j=0;

			while(j<s.size())
			{
				if(j!=s.size()-1)
				{
			if(!(s.get(j).equals(s.get(j+1))))
			{
				flag++;
			}
				}
				else
				{
					break;
				}
			j++;
			}
					System.out.println(flag);
		
/*			for(int j=0; j<s.length+1; j++)
				{
					if(j!=s.length)
						{

					if(!s[j].equals(s[j+1]))
					{
					flag++;
					}
						}
					else
						{
							break;
						}
				}

			System.out.println(flag);
			*/
		}
}
					
				
