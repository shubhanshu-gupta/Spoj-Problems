

class insertionsort {
	public static void main(String args[])
	{
	
	int[] arr = {4,35,124,54,1,0,6,314,154,5,2222,89,35,15,542,76,245,87,26,68,233};
	
	int size = arr.length;
	int key;
	
	for(int j=1; j<size; j++)
	{
	key = arr[j];
	for(int i=j-1; i>=0 && key<arr[i]; i--)
	 { arr[i+1] = arr[i];
	arr[i+1]=key;
	}
	}
	
	for(int l=0; l<size; l++)
	{
	System.out.println(arr[l]);
	}
	}
}
