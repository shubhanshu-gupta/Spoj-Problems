import java.io.*;

class permut2SPOJ {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int t;
	int cnt=0;

	int[] arr = new int[10000];
	
	while(true)
	{
//        while((t=Integer.parseInt(in.readLine()))!=0)
//	{

	t = Integer.parseInt(in.readLine());

	if(t==0)
	{
	break;
	}
	else
	{
//	System.out.println(t+"/////");
//	int[] arr = new int[t];

	String str = in.readLine();

	for(int i=0; i<t; i++)
	{
//	String str = in.readLine();
//	System.out.println(arr[i]);
	arr[i] = Integer.parseInt(str.split(" ")[i]);
//   System.out.println(arr[i]);

	}
int cont=0;
	for(int i=0; i<t; i++)
	{	
	if(arr[arr[i]-1] == i+1)
	{
	cont++;
	}
	}
	
	if(cont==t)
	{
	System.out.println("ambiguous");
	}
	else
	{
	System.out.println("not ambiguous");
	}
	}
	

	}
}
}	
		
