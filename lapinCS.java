import java.util.*;
import java.io.*;

class lapinCS {
	public static void main(String args[]) throws IOException
	{
	
//	Scanner in = new Scanner(System.in);
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        int test = Integer.parseInt(str);

	


	for(int i=0; i<test; i++)
	{
	str = in.readLine();
	

	List<Character> c = new ArrayList<Character>();  
      
        for(char ch:str.toCharArray())
        {
        c.add(ch);
        }
	
	HashSet<Character> uniq = new HashSet<Character>();

	for(char ch:str.toCharArray())
        {
        uniq.add(ch);
        }

	List<Character> c1 = new ArrayList<Character>();
	List<Character> c2 = new ArrayList<Character>();

	
	int len = str.length();
	int half;
	int count=0;
	int num = uniq.size();
//	System.out.println(num);
//	int[] n = new int[num];
 	int cnt=0;
	int cnt1=0;

	if(len%2==0)
	{
	 half = (len/2);
        String st1 = str.substring(0,half);
        String st11= str.substring(half,len);
        String str11 = st1+st11;
//	System.out.println(str11);	
	char[] first = st1.toCharArray();
	char[] second = st11.toCharArray();
	Arrays.sort(first);
	Arrays.sort(second);

	if(Arrays.equals(first,second)==true)
	{
	cnt =1;
	}
	else
	{
	cnt = 0;
	}

	if(cnt==1)
	{
	System.out.println("YES");
	}
	else
	System.out.println("NO");
	}
	
//	half = len/2;
//	half = c.size()/2;
//	System.out.println(half);
/*	for(int k=0; k<half; k++)
	{
//	System.out.println(c.get(k));

		c1.add(c.get(k));
//	 System.out.println(c1.get(k));

	char a = c1.get(k); 
	
	if(Collections.frequency(c1,a)%2==0)
	{
	//cnt = Collections.frequency(c1,a);
	
	}
	else
	{
	cnt = Collections.frequency(c1,a);
	}
	}

	for(int l=half; l<c.size(); l++)
        {

                c2.add(c.get(l));
	System.out.println(c2.get(l));
        char a1 = c2.get(l);
//	System.out.println(a);
        if(Collections.frequency(c2,a1)%2==0)
        {
        cnt1 = Collections.frequency(c2,a1);
        }
        else
        {
        cnt1 = Collections.frequency(c2,a1);
        }
        }
	

	for(int j=0; j<len; j++)
	{
	char cha = c.get(j);
	
	
	if(Collections.frequency(c,cha)%2==0)
	{
	count=Collections.frequency(c,cha);
	}
	else
	{
	count=Collections.frequency(c,cha);
	}
	}
	
	if(count%2!=0 || cnt!=1 || cnt1!=1)
	{
	System.out.println("NO");
	}

	else 
	{
	System.out.println("YES");
	}
	
*/


	else
	{
	int haf = (int)(len/2);
	String st = str.substring(0,haf);
	String st1= str.substring(haf+1,len);
	String str1 = st+st1;

	c.remove(haf);
	
	 char[] first = st.toCharArray();
        char[] second = st1.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        if(Arrays.equals(first,second)==true)
        {
        cnt1 =1;
        }
        else
        {
        cnt1 = 0;
        }

        if(cnt1==1)
        {
        System.out.println("YES");
        }
        else
        System.out.println("NO");
        }

	/*
	HashSet<Character> uniq1 = new HashSet<Character>();

        for(char ch1:str1.toCharArray())
        {
        uniq1.add(ch1);
        }
	
	int num1 = uniq1.size();



        for(int j=0; j<c.size(); j++)
        {

	char cha = c.get(j);

       
        if(Collections.frequency(c,cha)%2==0)
        {
        count=Collections.frequency(c,cha);
       
        }
        else
        {
        count=Collections.frequency(c,cha);
        }


        }

        if(count%2!=0 || num1%2!=0)
        {
        System.out.println("NO");
        }

        else
        {
        System.out.println("YES");
        }

	}*/

}
}}		
