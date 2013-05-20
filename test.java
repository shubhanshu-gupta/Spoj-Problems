import java.util.*;

class test{
        public static void main(String args[])
        {

int a;
int i;

        int[] var = new int[100000];

        Scanner in = new Scanner(System.in);

        for(i=0; i<var.length; i++)
        {
	
        var[i] = in.nextInt();
 	if(var[i] == 42)
	{
      	a=i;
	//System.out.println(a);
	break;
	}
	}
	
	
	

        for(a=0; a<i; a++)
        {
        System.out.println(var[a]);
        }
        
}
}

