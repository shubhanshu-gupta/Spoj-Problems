
class bstsorting {

	public static class Node {
	Node left;
	Node right;
	int key;
	
	public Node(int value)
	{
	key = value;
	}
	}	


/*	public static Node createminBST(int a[], int start, int end)
	{
	if(end<start)
	return null;
	
	int mid = (start+mid)/2;
	
	Node n = new Node(arr[mid]);
	n.left = createminBST(arr, start, mid-1);
	n.right = createminBST(arr, mid+1, end);
	
	return n;
	}
*/
	public static void insert(Node n, int v)
	{
	if(v<n.key)
	{
	  if(n.left!=null)
	{
	insert(n.left,v);
	}
	  else
	{
	System.out.println("Inserted value " + n.key );
	n.left = new Node(v);
	}
	}
	else
        { 
          if(n.right!=null)
        {
        insert(n.right,v);
        }
          else
        {
        System.out.println("Inserted value " + n.key );
        n.right = new Node(v);
        }
        }
	}
 
	public static Node root;
	
	public static Node getparent(Node n, Node no)	
	{
	Node current = n;
	
	Node parent = null;
	
	while(true)
	{
		if(current == null)
		{
		return null;
		}
		if(current.key == no.key)
		{
		break;	
		}
		if(current.key > no.key)
		{
		  parent = current;
		  current = current.left;
		}
		else
		{
		parent = current;
		current = current.right;
		}
	}
	return parent;
	}

	public static Node search(int k,Node x)
        {
            if(k == x.key)
            {
                return x;
            }
            else
            {
                if(k < x.key)
                {
                   return search(k,x.left);
                }
                else
                {
                    return search(k,x.right);
                }
            
            }
           
        }
	
	public static void main(String args[])
	{
	int[] arr = {5,4,7,3,9,0,2,8,1,6};
	int n = arr.length;
	int temp;

/*	for(int i=0; i<n; i++)	
	{
	for(int j=0; j<n-i; j++)
	{
	  if(arr[j]>arr[j+1])
	{
	temp = arr[j];
	arr[j] = arr[j+1];
	arr[j+1] = temp;
	}
	}
	}*/
//int	mid = (arr[0]+arr[n])/2;
//	root = new Node(mid);	
	root = new Node(5);	
//	insert(root,mid);
	insert(root,9);
	insert(root,4);
	insert(root,7);
	insert(root,3);
	insert(root,0);
//	insert(root,2);
//	insert(root,8);
//	insert(root,1);
//	insert(root,6);
	
	Node o = search(7,root);
	Node p = getparent(root,o);
	System.out.println(p.key);

	}	
}
